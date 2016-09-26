package com.ymatou.deviceid.facade.rest;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import com.ymatou.deviceid.facade.model.PrintFriendliness;
import com.ymatou.deviceid.facade.model.resp.DeviceInfoResp;
import com.ymatou.deviceid.facade.model.vo.DeviceInfo;
import com.ymatou.deviceid.infrastructure.config.BizConfig;
import com.ymatou.deviceid.repository.DeviceIdRepository;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;


/**
 * Created by liangzhonghua on 2016/9/22.
 */
@Component("deviceIdResource")
@Service(protocol = "rest")
@Produces({"application/json"})
@Path("/")
public class DeviceIdResourceImpl implements DeviceIdResource {
    public static final Logger logger = LoggerFactory.getLogger(DeviceIdResourceImpl.class);

    @Autowired
    private DeviceIdRepository deviceIdRepository;
    @Autowired
    private BizConfig bizConfig;

    @POST
    @Path("/save")
    @Consumes("application/json")
    @Override
    public BaseNetCompatibleResp saveDeviceId(HashMap<String, Object> dataMap) {
        logger.info("activedeviceid:"+ PrintFriendliness.toJson(dataMap));

        BaseNetCompatibleResp response = new BaseNetCompatibleResp();
        String deviceId = null;
        try {
            deviceId = (String)dataMap.get("deviceid");

            boolean isMd5Verified = verifyMD5(dataMap);
            logger.info(deviceId+",md5verfied:"+isMd5Verified);
            dataMap.put("signVerified",isMd5Verified);
            dataMap.put("activeTime",new Date());

            deviceIdRepository.save(dataMap);
            response.setBcode(0);
            response.setCode(0);
            response.setMsg("saved ok");
            logger.info("save deviceid ok:"+deviceId);
        }catch(Exception e)
        {
            logger.error("activedeviceid exception:"+deviceId+","+e.getMessage(),e);
            response.setCode(101);
            response.setMsg(e.getMessage());

        }

        return response;
    }

    private String getEntryValue(HashMap<String,Object> map,String key)
    {
       return  map.containsKey(key)?(String) map.get(key):"";

    }

    private final String secret =bizConfig.getMd5key() ;
    private boolean verifyMD5(HashMap<String,Object> map)
    {

        if(map.containsKey("signVerified"))
           if ((boolean)map.get("signVerified"))
               return (boolean)map.get("signVerified");



        StringBuilder sb =new StringBuilder();
        sb.append(getEntryValue(map,"appkey"));
        sb.append(getEntryValue(map,"appversion"));
        sb.append(getEntryValue(map,"deviceid"));
        sb.append(getEntryValue(map,"acceptversion"));
        sb.append(getEntryValue(map,"timestamp"));


        char[] array = sb.toString().toCharArray();
        Arrays.sort(array);

        String signString = String.valueOf(array).concat(secret);

       // String md5= Hashing.md5().hashString(signString.toCharArray(), Charsets);

        String md5 = DigestUtils.md5Hex(signString);
        String sign = getEntryValue(map,"sign");
        if(org.springframework.util.StringUtils.isEmpty(sign)) return false;

        return md5.equalsIgnoreCase(sign);
//["app-key", "app-version", "deviceid", "accept-version", "timestamp"]


        /*
        func buildHeader(accept_version: String, parameters: [String: AnyObject]?) {
        self._header["accept-version"] = accept_version
        self._header["timestamp"] = String(Int64(NSDate().timeIntervalSince1970 * 1000))

        // 签名
        var ret_arr: [String] = []

        let sign_arr = ["app-key", "app-version", "deviceid", "accept-version", "timestamp"]
        for key in sign_arr {
            var tmp_ret = key
            if let tmp = self._header[key] {
                tmp_ret += tmp
            }
            ret_arr.append(tmp_ret)
        }

        if parameters != nil {
            for (k, v) in parameters! {
                if let tmp = v as? JSONDictionary {
                    let tmp_ret = k + (MTToJSONString(tmp) as String)
                    ret_arr.append(tmp_ret)
                } else if let tmp = v as? NSArray {
                    for i in 0 ..< tmp.count {
                        var tmp_ret = ""
                        let cur_v = tmp[i]
                        if cur_v is JSONDictionary || cur_v is NSArray {
                            tmp_ret = "\(k)[\(i)]\(MTToJSONString(tmp[i]))"
                        } else {
                            tmp_ret = "\(k)[\(i)]\(tmp[i])"
                        }
                        ret_arr.append(tmp_ret)
                    }
                } else {
                    let tmp_ret = k + String(v)
                    ret_arr.append(tmp_ret)
                }
            }
        }

        // 按照ASCII排序
        ret_arr.sortInPlace()

        // MD5
        let secret = "m8y9uKNrhwVu1Euc"
        var sign_str = secret

        for str in ret_arr {
            sign_str += str
        }

        sign_str += secret

        let md5 = sign_str.utf8.description.md5()
        self._header["sign"] = md5
    }

         */
    }

    @GET
    @Path("/get")
    @Consumes("*/*")
    @Override
    public BaseNetCompatibleResp get(@QueryParam("deviceId") String deviceId) {
        logger.info("getdeviceId:"+deviceId);
        BaseNetCompatibleResp response = new BaseNetCompatibleResp();
        if(StringUtils.isEmpty(deviceId)){
            response.setCode(100);
            response.setMsg("参数不能为空");

            return response;
        }

        try {
            DeviceInfo deviceInfo= deviceIdRepository.getDeviceInfo(deviceId);

            if(deviceInfo==null)
            {
                response.setCode(102);
                response.setMsg(deviceId+"  not exists");
            }
            else
            {
                DeviceInfoResp resp = new DeviceInfoResp();
                resp.setActiveTime(deviceInfo.getActiveTime());
                resp.setUserId(deviceInfo.getUserid());
                resp.setSignVerified(deviceInfo.isSignVerified());

                response.setData(resp);
                response.setMsg(deviceId+" exists");
            }
       }catch(Exception e)
        {

            logger.error("getdeviceid exception:"+deviceId+","+e.getMessage(),e);
            response.setCode(101);
            response.setMsg(e.getMessage());

        }

        logger.info("getdeviceId:"+deviceId+" resp:"+response.toString());
        return response;
    }
}

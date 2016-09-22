package com.ymatou.deviceid.util;

import java.math.BigDecimal;

/**
 * Created by zhangzhiqiang on 2016/9/6.
 * BigDecimal 帮助类
 */
public class BigDecimalUtil {
    /**
     * 是否大于
     * @param source 原值
     * @param compareTo 被比较值
     * @return
     */
    public static boolean isBiggerThan(BigDecimal source, BigDecimal compareTo){

        if(source == null){
            source = BigDecimal.ZERO;
        }
        if(source.compareTo(compareTo) > 0 ){
            return true;
        }
        return false;
    }

    public static boolean isBiggerThanOrEqual(BigDecimal source,BigDecimal compareTo){
        if(source == null){
            source = BigDecimal.ZERO;
        }
        if(source.compareTo(compareTo) >= 0){
            return true;
        }
        return false;
    }

    public static boolean isBiggerThanZero(BigDecimal source){
        return isBiggerThan(source,BigDecimal.ZERO);
    }

    public static boolean isBiggerThanOrEqualZero(BigDecimal source){
        return isBiggerThanOrEqual(source,BigDecimal.ZERO);
    }
    public static boolean isEqualZero(BigDecimal source){
        return isEqual(source,BigDecimal.ZERO);
    }

    public static boolean isEqual(BigDecimal source,BigDecimal compareTo){
        if(source == null){
            source = BigDecimal.ZERO;
        }
        if(source.compareTo(compareTo) == 0){
            return true;
        }
        return false;
    }
}

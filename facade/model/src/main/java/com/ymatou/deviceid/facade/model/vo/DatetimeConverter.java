/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package com.ymatou.deviceid.facade.model.vo;


import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import javax.ws.rs.ext.Provider;

/**
 * @author luoshiqian 2016/5/10 12:07
 */
@Provider
public class DatetimeConverter implements Converter<String,DateTime> {


    @Override
    public DateTime convert(String value) {
        DateTime dateTime= null;
        try {
            dateTime = DateTime.parse(value, DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss"));
        } catch (Exception e) {
            dateTime = DateTime.parse(value, DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss"));
        }
        return dateTime;
    }

    @Override
    public JavaType getInputType(TypeFactory typeFactory) {
        return typeFactory.constructType(String.class);
    }

    @Override
    public JavaType getOutputType(TypeFactory typeFactory) {
        return typeFactory.constructType(DateTime.class);
    }
}

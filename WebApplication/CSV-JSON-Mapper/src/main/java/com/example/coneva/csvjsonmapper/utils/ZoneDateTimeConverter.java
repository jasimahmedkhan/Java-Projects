package com.example.coneva.csvjsonmapper.utils;

import com.opencsv.bean.AbstractBeanField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ZoneDateTimeConverter extends AbstractBeanField {

    private Logger logger = LoggerFactory.getLogger(ZoneDateTimeConverter.class);

    @Override
    protected Object convert(String strDate) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.n").withZone(ZoneId.systemDefault());
        ZonedDateTime zdt = ZonedDateTime.parse(strDate, dtf);
        return zdt;

    }
}


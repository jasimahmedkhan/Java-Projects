package com.example.coneva.csvjsonmapper.utils;

import com.opencsv.bean.AbstractBeanField;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDateTimeConverter extends AbstractBeanField {
    @Override
    protected Object convert(String value) {
        System.out.println(value);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSZ");
        return ZonedDateTime.parse(value, formatter);

    }
}


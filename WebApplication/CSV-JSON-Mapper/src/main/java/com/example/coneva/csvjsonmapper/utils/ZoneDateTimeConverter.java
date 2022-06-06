package com.example.coneva.csvjsonmapper.utils;

import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvConstraintViolationException;
import com.opencsv.exceptions.CsvDataTypeMismatchException;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDateTimeConverter extends AbstractBeanField {
    @Override
    protected Object convert(String value) {
        System.out.println(value);

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSZ");
//        return ZonedDateTime.parse(value, formatter);

        OffsetDateTime date = OffsetDateTime.of(LocalDateTime.parse(value, DateTimeFormatter.ISO_DATE_TIME), ZoneOffset.UTC);
        System.out.println("printing the date");
        System.out.println(date);
        return date;

    }
}


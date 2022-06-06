package com.example.coneva.csvjsonmapper.utils;

import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvConstraintViolationException;
import com.opencsv.exceptions.CsvDataTypeMismatchException;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeConverter extends AbstractBeanField {
    @Override
    protected Object convert(String strDate) throws CsvDataTypeMismatchException, CsvConstraintViolationException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss.n").withZone(ZoneId.systemDefault());
        ZonedDateTime zdt = ZonedDateTime.parse(strDate, dtf);
        OffsetDateTime odt = zdt.toOffsetDateTime();
        return odt;
    }
}

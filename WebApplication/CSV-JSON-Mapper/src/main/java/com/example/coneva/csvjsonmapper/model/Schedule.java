package com.example.coneva.csvjsonmapper.model;
import com.example.coneva.csvjsonmapper.utils.OffsetDateTimeConverter;
import com.example.coneva.csvjsonmapper.utils.OffsetDateTimeToStringConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;

import java.time.OffsetDateTime;

public class Schedule {

    /* Think about these whether to add them in the final JSON or not*/

//    @CsvBindByName
//    private String siteToken;

//    @CsvBindByName
//    SiteType siteType;

//    @CsvBindByName
//    ResolutionType resolution;
//
//    @CsvBindByName
//    String portfolioId;

//    @CsvBindByName
//    private long optimization_id;

//    @CsvBindByName
//    private OffsetDateTime timestamp;


    // attributes of the class entity

    @JsonProperty("id")
    @CsvBindByName
    private long id;

    @JsonProperty("schedule_id")
    @CsvBindByName
    private long schedule_id;


//    https://stackoverflow.com/questions/65087910/how-to-parse-offsetdatetime-from-csv-file
//    Your date-time string (e.g. 2020-09-18 06:50:00.000000 as you have mentioned in the question)
//    in the CSV does not have timezone-offset and therefore the most appropriate type to parse it into would be LocalDateTime
//    OR if you really want to in the OffsetDateTime then follow the link.
    // https://sunitc.dev/2020/05/31/read-csv-file-to-java-bean-using-open-csv/




//    @JsonSerialize(using = OffsetDateTimeSerializer.class)
//    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
    @JsonSerialize(converter = OffsetDateTimeToStringConverter.class)
    @JsonProperty("timestamp_start")
    @CsvCustomBindByName (column = "timestamp_start", converter = OffsetDateTimeConverter.class)
    private OffsetDateTime timestamp_start;

//    @JsonSerialize(using = OffsetDateTimeSerializer.class)
//    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssz")
    @JsonSerialize(converter = OffsetDateTimeToStringConverter.class)
    @JsonProperty("timestamp_end")
    @CsvCustomBindByName(column = "timestamp_end", converter = OffsetDateTimeConverter.class)
    private OffsetDateTime timestamp_end;

    @JsonProperty("power_value")
    @CsvBindByName
    private Double power_value;

    @JsonProperty("power_unit")
    @CsvBindByName
    private String power_unit;

    @JsonProperty("power_direction")
    @CsvBindByName
    private String power_direction;

    @JsonProperty("power_constraint")
    @CsvBindByName
    private String power_constraint;


    public Schedule(long id, long schedule_id, OffsetDateTime timestamp_start,
                    OffsetDateTime timestamp_end, Double power_value,
                    String power_unit, String power_direction, String power_constraint) {

        this.id = id;
        this.schedule_id = schedule_id;
        this.timestamp_start = timestamp_start;
        this.timestamp_end = timestamp_end;
        this.power_value = power_value;
        this.power_unit = power_unit;
        this.power_direction = power_direction;
        this.power_constraint = power_constraint;
    }

    public Schedule() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(long schedule_id) {
        this.schedule_id = schedule_id;
    }

    public OffsetDateTime getTimestamp_start() {
        return timestamp_start;
    }

    public void setTimestamp_start(OffsetDateTime timestamp_start) {
        this.timestamp_start = timestamp_start;
    }

    public OffsetDateTime getTimestamp_end() {
        return timestamp_end;
    }

    public void setTimestamp_end(OffsetDateTime timestamp_end) {
        this.timestamp_end = timestamp_end;
    }

    public Double getPower_value() {
        return power_value;
    }

    public void setPower_value(Double power_value) {
        this.power_value = power_value;
    }

    public String getPower_unit() {
        return power_unit;
    }

    public void setPower_unit(String power_unit) {
        this.power_unit = power_unit;
    }

    public String getPower_direction() {
        return power_direction;
    }

    public void setPower_direction(String power_direction) {
        this.power_direction = power_direction;
    }

    public String getPower_constraint() {
        return power_constraint;
    }

    public void setPower_constraint(String power_constraint) {
        this.power_constraint = power_constraint;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", schedule_id=" + schedule_id +
                ", timestamp_start=" + timestamp_start +
                ", timestamp_end=" + timestamp_end +
                ", power_value=" + power_value +
                ", power_unit='" + power_unit + '\'' +
                ", power_direction='" + power_direction + '\'' +
                ", power_constraint='" + power_constraint + '\'' +
                '}';
    }
}

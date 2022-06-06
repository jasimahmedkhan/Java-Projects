package com.example.coneva.csvjsonmapper.model;

import com.opencsv.bean.CsvBindByName;

import java.time.OffsetDateTime;

public class Schedule {

//    input attributes:

    //#,id,schedule_id,timestamp_start,timestamp_end,power_value,power_unit,power_direction,power_constraint


    // output as JSON
//    "id": 1367,
//    "optimizations_id": 1367,
//    "timestamp": "2022-05-10 15:10:00.000000 +00:00",
//    "timestamp_start": "2022-05-10 22:00:00.000000 +00:00",
//    "timestamp_end": "2022-05-11 22:00:00.000000 +00:00",
//    "site_token": "bdd0a854-d9ee-4b4d-af57-1d945c5ea21f",
//    "site_type": "EvPark",
//    "resolution": "QuarterHours",
//    "portfolio_id": "SeedGreetHilden"

    @CsvBindByName
    private long id;

//    @CsvBindByName
//    private long optimization_id;

    @CsvBindByName
    private long schedule_id;

//    @CsvBindByName
//    private OffsetDateTime timestamp;

    @CsvBindByName
    private OffsetDateTime timestamp_start;

    @CsvBindByName
    private OffsetDateTime timestamp_end;

//    @CsvBindByName
//    private String siteToken;

//    @CsvBindByName
//    SiteType siteType;

//    @CsvBindByName
//    ResolutionType resolution;
//
//    @CsvBindByName
//    String portfolioId;

    @CsvBindByName
    private Double power_value;

    @CsvBindByName
    private String power_unit;


    @CsvBindByName
    private String power_direction;

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

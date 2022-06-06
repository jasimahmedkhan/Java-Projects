package com.example.coneva.csvjsonmapper;

import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.base.CaseFormat;


public enum SiteType {
    EV_PARK,
    EV_PORTFOLIO,
    SUPERMARKET,
    UNSPECIFIED;

    @JsonValue
    public String toString() {
        return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, this.name());
    }

    public static SiteType fromString(String str) {
        for (SiteType type : SiteType.values())
            if (type.toString().equalsIgnoreCase(str)) return type;
        return null;
    }
}

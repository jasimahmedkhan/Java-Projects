package com.coneva.model.flexestimation;

import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.base.CaseFormat;

public enum ResolutionType {

	HOURS(60),
	QUARTER_HOURS(15),
	UNSPECIFIED(0);

	private final int minutes;
	
	ResolutionType(int i) {
		this.minutes = i;
	}

	@JsonValue
	public String toString() {
		return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, this.name());
	}

	public int toMinutes() {
		return minutes;
	}

	public static ResolutionType fromMinutes(int minutes) {
		for (ResolutionType type : ResolutionType.values()) { 
			if (minutes == type.toMinutes()) return type;
		}
		return UNSPECIFIED;
	}
	
	public static ResolutionType fromString(String str) {
		for (ResolutionType type : ResolutionType.values()) { 
			if (type.toString().equalsIgnoreCase(str)) return type;
		}
		for (ResolutionType type : ResolutionType.values()) { 
			try {
				if (Integer.parseInt(str) == type.toMinutes()) return type;
			}
			catch (Exception e) {
			    return null;
			}
		}
		return null;
	}
}

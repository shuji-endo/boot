package com.simwelman.boot;

import lombok.Data;

@Data
public class WeatherEntity {

	private Integer id;
	
	private Integer locationId;
	
	private String name;
	
	private Integer temperature;
	
	private Integer hamidity;
	
	private String dateTime;
}

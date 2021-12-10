package com.simwelman.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

	@Autowired
	private WeatherMapper weatherMapper;
	
	public List<WeatherEntity> selectAll() {
		return weatherMapper.selectAll();
	}
}

package com.simwelman.boot;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface WeatherMapper {

	@Select("SELECT * FROM weather")
	List<WeatherEntity> selectAll();
}

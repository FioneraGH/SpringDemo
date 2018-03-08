package com.fionera.test.mapper;

import com.fionera.test.domain.City;

import org.apache.ibatis.annotations.Param;

/**
 * CityMapper
 * Created by fionera on 17-4-10.
 */
public interface CityMapper {
    City findByName(@Param("cityName") String cityName);
    boolean addNewOne(@Param("city") City city);
}

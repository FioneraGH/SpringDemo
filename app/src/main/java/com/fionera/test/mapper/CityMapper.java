package com.fionera.test.mapper;

import com.fionera.test.domain.City;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * CityMapper
 * Created by fionera on 17-4-10.
 */
@Repository
public interface CityMapper {
    City findByName(@Param("cityName") String cityName);
    boolean addNewOne(@Param("city") City city);
}

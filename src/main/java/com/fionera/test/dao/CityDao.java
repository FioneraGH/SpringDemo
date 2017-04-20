package com.fionera.test.dao;

import com.fionera.test.domain.City;

import org.apache.ibatis.annotations.Param;

/**
 * CityDao
 * Created by fionera on 17-4-10.
 */
public interface CityDao {
    City findByName(@Param("cityName") String cityName);
}

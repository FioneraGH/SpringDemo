package com.fionera.test.service;

import com.fionera.test.domain.City;

/**
 * CityService
 * Created by fionera on 17-4-20.
 */
public interface CityService {
    City findCityByName(String cityName);
}

package com.fionera.test.service.impl;

import com.fionera.test.mapper.CityMapper;
import com.fionera.test.domain.City;
import com.fionera.test.service.CityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CityServiceImpl
 * Created by fionera on 17-4-20.
 */
@Service
public class CityServiceImpl implements CityService {

    private final CityMapper cityMapper;

    @Autowired
    public CityServiceImpl(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Override
    public City findCityByName(String cityName) {
        return cityMapper.findByName(cityName);
    }

    @Override
    public boolean addNewCity(City city) {
        return cityMapper.addNewOne(city);
    }
}

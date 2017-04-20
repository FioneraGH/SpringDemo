package com.fionera.test.service.impl;

import com.fionera.test.dao.CityDao;
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

    private final CityDao cityDao;

    @Autowired
    public CityServiceImpl(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }
}

package com.fionera.test.service;

import com.fionera.test.Application;
import com.fionera.test.domain.City;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * CityServiceTest
 * Created by fionera on 2018/3/24 in spring_demo.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class CityServiceTest {

    @Autowired
    private CityService cityService;

    @Test
    public void testCityService() {
        City city = cityService.findCityByName("青岛");
        System.out.println(city.getDescription());
        assert city.getCityId() == 1;
    }
}

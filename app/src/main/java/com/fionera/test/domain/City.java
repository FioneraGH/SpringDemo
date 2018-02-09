package com.fionera.test.domain;

/**
 * City
 * Created by fionera on 17-4-10.
 */
public class City {
    private Long cityId;
    private String cityName;
    private String description;

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

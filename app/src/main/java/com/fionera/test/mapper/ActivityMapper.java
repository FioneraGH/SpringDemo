package com.fionera.test.mapper;

import com.fionera.test.domain.Activity;

import java.util.List;

/**
 * ActivityMapper
 * Created by fionera on 17-5-17.
 */
public interface ActivityMapper {
    List<Activity> selectAll();

    Activity selectById(int id);
    void insert(Activity activity);
    void update(Activity activity);
    void deleteById(int id);
}

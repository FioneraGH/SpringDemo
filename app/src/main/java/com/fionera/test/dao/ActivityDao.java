package com.fionera.test.dao;

import com.fionera.test.domain.Activity;

import java.util.List;

/**
 * ActivityDao
 * Created by fionera on 17-5-17.
 */
public interface ActivityDao {
    List<Activity> selectAll();

    Activity selectById(int id);
    void insert(Activity activity);
    void update(Activity activity);
    void deleteById(int id);
}

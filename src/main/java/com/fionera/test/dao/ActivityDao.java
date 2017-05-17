package com.fionera.test.dao;

import com.fionera.test.domain.Activity;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ActivityDao
 * Created by fionera on 17-5-17.
 */
public interface ActivityDao {
    List<Activity> selectAll();

    Activity selectById(@Param("id") int id);
}

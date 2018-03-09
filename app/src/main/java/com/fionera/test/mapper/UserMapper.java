package com.fionera.test.mapper;

import com.fionera.test.domain.User;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * CityMapper
 * Created by fionera on 17-4-10.
 */
@Repository
public interface UserMapper {
    User findByName(@Param("username") String username);
}

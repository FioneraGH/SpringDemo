package com.fionera.test.domain;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;

/**
 * ActivityTest
 * Created by fionera on 17-5-17.
 */
public class ActivityTest {

    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    @Before
    public void setUp() throws Exception {
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Activity activity = sqlSession.selectOne("com.fionera.test.dao.ActivityDao.selectById",
                10);
        Assert.assertEquals("查找成功", "爱美丽", activity.getTitle());
    }
}

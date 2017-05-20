package com.fionera.test.domain;

import com.fionera.test.dao.ActivityDao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;
import java.util.Date;

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
//        Activity activity = sqlSession.selectOne("com.fionera.test.dao.ActivityDao.selectById",
//                10);
        ActivityDao activityDao = sqlSession.getMapper(ActivityDao.class);
        Activity activity = activityDao.selectById(10);
        sqlSession.commit();
        Assert.assertEquals("查找成功", "爱美丽", activity.getTitle());
        sqlSession.close();
    }

    @Test
    public void insert() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ActivityDao activityDao = sqlSession.getMapper(ActivityDao.class);
        Activity activity = new Activity();
        activity.setTitle("测试插入");
        activity.setNote("插入数据");
        activity.setImgPath("https://www.baidu.com/");
        activity.setStartTime(new Date());
        activity.setEndTime(new Date());
        activityDao.insert(activity);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void update() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ActivityDao activityDao = sqlSession.getMapper(ActivityDao.class);
        Activity activity = activityDao.selectById(10);
        activity.setTitle("测试更新");
        activity.setNote("更新数据");
        activity.setStartTime(new Date());
        activity.setEndTime(new Date());
        activityDao.update(activity);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void delete() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ActivityDao activityDao = sqlSession.getMapper(ActivityDao.class);
        activityDao.deleteById(10);
        sqlSession.commit();
        sqlSession.close();
    }
}

package com.spy.aiyou.dao;

import com.spy.aiyou.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: spy
 * @Date: 2018/7/14 09:19
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert() {
        User user = new User();
        user.setUsername("itachi2");
        user.setPassword("123456");
        user.setTelephone("1234567894562");
        System.out.println(userMapper.insert(user));
    }
}
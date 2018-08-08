package com.spy.aiyou.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.spy.aiyou.dao.UserMapper;
import com.spy.aiyou.pojo.User;
import com.spy.aiyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @Auther: spy
 * @Date: 2018/7/12 19:21
 * @Description:
 */
@Service()
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String regist(User user) {

        if (userMapper.insert(user) > 0){
            return UUID.randomUUID().toString().replace("-", "");
        }
        return null;
    }
}

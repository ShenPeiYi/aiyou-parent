package com.spy.aiyou.service;

import com.spy.aiyou.pojo.User;

/**
 * @Auther: spy
 * @Date: 2018/7/12 19:17
 * @Description:
 */
public interface UserService {
    /**
     * 用户注册
     * @param user
     * @return 成功返回激活码
     */
    public String regist(User user);
}

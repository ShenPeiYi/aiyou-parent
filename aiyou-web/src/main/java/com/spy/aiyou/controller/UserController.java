package com.spy.aiyou.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.spy.aiyou.pojo.User;
import com.spy.aiyou.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: spy
 * @Date: 2018/7/13 11:30
 * @Description:
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Reference
    private UserService userService;

    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public Map<String, Object> regist(User user){
        Map<String, Object> map = new HashMap<>();
        String activeCode = userService.regist(user);
        String result = "";
        if (activeCode != null){
            result = "注册成功，激活码："+activeCode;
        }else {
            result = "抱歉，注册失败。";
        }
        map.put("result", result);
        return map;
    }
}

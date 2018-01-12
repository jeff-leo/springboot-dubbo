package com.yy.test.dubbodemo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yy.test.dubbodemo.domin.User;
import com.yy.test.dubbodemo.service.ClientUserService;
import com.yy.test.dubbodemo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author liujianfeng
 * @date 2018/1/12 17:16
 */
//这里用Spring的service
@Service
public class ClientUserServiceImpl implements ClientUserService{

    //通过dubbo的Reference引用，获取到server的UserService实现
    @Reference(version = "1.0.0")
    UserService userService;

    @Override
    public User getUser(String uid) {
        return userService.getUserById(uid);
    }

}

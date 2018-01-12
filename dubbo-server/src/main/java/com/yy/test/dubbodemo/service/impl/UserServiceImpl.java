package com.yy.test.dubbodemo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yy.test.dubbodemo.domin.User;
import com.yy.test.dubbodemo.service.UserService;

/**
 * @author liujianfeng
 * @date 2018/1/12 17:06
 */
// 使用dubbo的Service,表示注册为 Dubbo 服务
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(String uid) {
        User user = new User();
        user.setUid(uid);
        user.setName("liujianfeng");
        return user;
    }
}

package com.yy.test.dubbodemo.controller;

import com.yy.test.dubbodemo.domin.User;
import com.yy.test.dubbodemo.service.ClientUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liujianfeng
 * @date 2018/1/12 17:17
 */
@RestController
public class UserController {

    @Autowired
    private ClientUserService clientUserService;

    @RequestMapping(value = "/user/{uid}")
    public User user(@PathVariable String uid) {
        return clientUserService.getUser(uid);
    }
}

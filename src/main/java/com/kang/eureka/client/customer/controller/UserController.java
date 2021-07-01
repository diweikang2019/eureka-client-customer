package com.kang.eureka.client.customer.controller;

import com.kang.eureka.client.customer.service.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weikang.di
 * @date 2021/6/30 17:15
 */
@RestController
public class UserController {

    @Autowired
    private UserFeign userFeign;

    @GetMapping("/getUserById")
    public String getUserById(@RequestParam("id") Integer id) {
        return userFeign.getUserById(id);
    }
}

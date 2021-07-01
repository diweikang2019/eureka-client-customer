package com.kang.eureka.client.customer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author weikang.di
 * @date 2021/6/30 17:12
 */
@Component
@FeignClient(value = "eureka-client-provider")
public interface UserFeign {

    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    public String getUserById(@RequestParam("id") Integer id);
}

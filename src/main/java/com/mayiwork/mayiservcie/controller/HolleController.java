package com.mayiwork.mayiservcie.controller;

import com.mayiwork.mayiservcie.bean.DemoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试demo
 * @author yingkuigou
 * @date 2019/4/6 20:29
 */

@RestController
@RequestMapping("/demo")
public class HolleController {

    /*    @Value("${name}")
        private String name;

        @Value("${age}")
        private Integer age;*/
    @Autowired
    private DemoUser demoUser;

    @GetMapping("hello.json")
    public String getHello() {
        // return "hello" + "age=" + demoUser.getAge() + "name=" + demoUser.getName();;
        return "hello";
    }

}

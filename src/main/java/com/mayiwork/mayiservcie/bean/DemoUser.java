package com.mayiwork.mayiservcie.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author yingkuigou
 * @date 2019/4/6 21:23
 */
@Component
@Configuration
@PropertySource("classpath:mayiserviceconfig.yml")
@ConfigurationProperties("demo")
public class DemoUser {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

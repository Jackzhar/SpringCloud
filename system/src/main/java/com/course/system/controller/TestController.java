package com.course.system.controller;

import com.course.system.domain.Test;
import com.course.system.service.TestService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@ComponentScan("com.course")
@MapperScan("com.course.system.mapper")
public class TestController {

   /* @RequestMapping("/test")
    public  String test(){
        return "success";
    }*/

    @Resource
    private TestService testService;
    @RequestMapping("/test")
    public List<Test> test(){
        return  testService.list();
    }
}

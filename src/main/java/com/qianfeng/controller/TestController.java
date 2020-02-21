package com.qianfeng.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.charset.Charset;

@Controller
public class TestController {

    //定义消息转换器
    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter(){
        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("ISO8859-1"));
        return converter;
    }

    @RequestMapping("/tt")
    @ResponseBody
    public String hello(){
        return "hello，固件";
    }
}

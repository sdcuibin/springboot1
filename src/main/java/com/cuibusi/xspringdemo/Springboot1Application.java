package com.cuibusi.xspringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.charset.Charset;

@Controller
@SpringBootApplication(exclude = RedisAutoConfiguration.class)
@Configuration
@ComponentScan(basePackages = "com.cuibusi")
public class Springboot1Application {

    @RequestMapping("first")
    @ResponseBody
    public String hello() {
        return "hello world 崔斌";
    }

    //配置自定义消息转换器
    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter(){
        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        return converter;
    }

    public static void main(String[] args) {
        SpringApplication.run(Springboot1Application.class, args);
    }


}



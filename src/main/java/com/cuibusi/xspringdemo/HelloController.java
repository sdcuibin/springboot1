package com.cuibusi.xspringdemo;

import com.cuibusi.xspringdemo.bean.AutorSettings;
import com.cuibusi.xspringdemo.bean.User;
import com.cuibusi.xspringdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HelloController {

    @Autowired
    private AutorSettings autorSettings;
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String index(){
        return "name is "+autorSettings.getName()+" and age is "+autorSettings.getAge();
    }

    @RequestMapping("ssm")
    public List<User> findAll(){
        return userService.findAll();
    }


}

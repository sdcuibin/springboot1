package com.cuibusi.xspringdemo.service;

import com.cuibusi.xspringdemo.bean.User;
import com.cuibusi.xspringdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author cuibusi
 * @create 2017-07-27 12:06
 **/

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    //测试
    @Cacheable(value = "findAll")
    public List<User> findAll() {
        System.out.println("如果第二次没有打印此段文字，说明走了缓存，没有执行此方法");
        List<User> list = userMapper.findAll();
        return list;
    }
}

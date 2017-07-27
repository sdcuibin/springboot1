package com.cuibusi.xspringdemo.service;

import com.cuibusi.xspringdemo.bean.User;
import com.cuibusi.xspringdemo.bean.UserExample;
import com.cuibusi.xspringdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Override
    public List<User> findAll() {
        List<User> list = userMapper.findAll();
        return list;
    }
}

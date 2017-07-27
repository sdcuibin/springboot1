package com.cuibusi.xspringdemo.service;

import com.cuibusi.xspringdemo.bean.User;
import com.cuibusi.xspringdemo.bean.UserExample;

import java.util.List;

/**
 * @author cuibusi
 * @create 2017-07-27 12:01
 **/

public interface UserService {
    public List<User>  findAll();
}

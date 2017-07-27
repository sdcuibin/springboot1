package com.cuibusi.xspringdemo.mapper;

import com.cuibusi.xspringdemo.bean.User;
import com.cuibusi.xspringdemo.bean.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    public List<User> findAll();
}
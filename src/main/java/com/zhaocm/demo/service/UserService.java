package com.zhaocm.demo.service;

import com.zhaocm.demo.entity.User;
import com.zhaocm.demo.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: zhaocm
 * @time: 2020/8/5
 */
@Service
public class UserService {

    @Autowired
    private IUserMapper userMapper;

    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }

}

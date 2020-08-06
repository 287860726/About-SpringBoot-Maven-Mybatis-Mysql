package com.zhaocm.demo.ctrl;

import com.zhaocm.demo.entity.User;
import com.zhaocm.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: zhaocm
 * @time: 2020/8/5
 */
@RestController
@RequestMapping("/user/")
public class UserCtrl {
    @Autowired
    private UserService userService;

    @RequestMapping("getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

}

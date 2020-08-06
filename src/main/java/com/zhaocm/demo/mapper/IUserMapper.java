package com.zhaocm.demo.mapper;

import com.zhaocm.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserMapper {

    List<User> getAllUser();
}

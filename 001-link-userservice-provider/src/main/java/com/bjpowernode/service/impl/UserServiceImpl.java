package com.bjpowernode.service.impl;

import com.bjpowernode.model.User;
import com.bjpowernode.service.UserService;
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setAge(11);
        user.setUserName("lsi");
        return user;
    }


}

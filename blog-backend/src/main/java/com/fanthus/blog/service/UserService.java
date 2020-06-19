package com.fanthus.blog.service;

import com.fanthus.blog.entity.User;

public interface UserService {

    User checkUser(String username,String password);
}

package com.fanthus.blog.service;

import com.fanthus.blog.dao.UserRepository;
import com.fanthus.blog.entity.User;
import com.fanthus.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        String md5pass = MD5Utils.code(password);
        User user = userRepository.findByUsernameAndPassword(username,md5pass);
        return user;
    }
}

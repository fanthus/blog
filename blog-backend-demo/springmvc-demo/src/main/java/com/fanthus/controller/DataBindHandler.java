package com.fanthus.controller;

import com.fanthus.entity.User;
import com.fanthus.entity.UserList;
import com.fanthus.entity.UserMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

@RestController
@RequestMapping("/data")
public class DataBindHandler {

    @RequestMapping("/baseType")
    public String baseType(int id) {
        return id+"";
    }

    @RequestMapping("/packageType")
    public String packageType(@RequestParam(value = "num", required = false, defaultValue = "0")  Integer id) {
        return id+"";
    }

    @RequestMapping("/array")
    public String array(String[] name) {
        String str = Arrays.toString(name);
        return str;
    }

    @RequestMapping("/list")
    public String list(UserList userList, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        String str = "";
        for (User user: userList.getUsers()) {
            str += user.toString();
        }
        return str;
    }

    @RequestMapping("/map")
    public String map(UserMap userMap) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String key: userMap.getUsers().keySet()) {
            User user = userMap.getUsers().get(key);
            stringBuffer.append(user);
        }
        return stringBuffer.toString();
    }

@RequestMapping("/json")
public User json(@RequestBody User user) {
    System.out.println(user);
    return user;
}
}

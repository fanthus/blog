package com.fanthus.controller;

import com.fanthus.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello")
public class HelloHandler {

    @RequestMapping(value = "/index",method = RequestMethod.GET, params = {"name","id"})
    public String index(String name,@RequestParam("id") int age) {
        System.out.println(age+":"+name);
        System.out.println("执行了 index");
        return "index";
    }

    //下面是 Restful 风格
    @RequestMapping("/index/{name}/{id}")
    public String reset(@PathVariable("name") String name,@PathVariable("id") int age) {
        System.out.println(name);
        System.out.println(age);
        return "index";
    }

    @RequestMapping("/cookie")
    public String cookie(@CookieValue(value = "JSESSIONID") String sessionid) {
        System.out.println(sessionid);
        return "index";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(User user) {
        System.out.println(user);
        return "index";
    }

@RequestMapping("/redirect")
public String redirect() {
    return "redirect:/index.jsp";
}

}

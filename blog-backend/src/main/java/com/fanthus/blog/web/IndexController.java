package com.fanthus.blog.web;//package com.fanthus.blog.web;


import com.fanthus.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {

//    @GetMapping("/{id}/{name}")
//    public String index(@PathVariable Integer id,@PathVariable String name) {
////        int i = 9/0;
////        String blog = null;
////        if (blog == null) {
////            throw new NotFoundException("博客不存在");
////        }
////        System.out.println("------index-------");
//        return "index";
//    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }
}

package com.fanthus.controller;

import com.fanthus.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tag")
public class TagHandler {

    @GetMapping("/get")
    public ModelAndView get() {
        ModelAndView modelAndView = new ModelAndView("show");
        Student student = new Student(1L,"张三",22);
        modelAndView.addObject("student",student);
        return modelAndView;
    }
}

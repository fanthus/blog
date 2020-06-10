package com.fanthus.controller;


import com.fanthus.entity.Student;
import com.fanthus.respository.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class RestHandler {

    @Autowired
    private StudentRespository studentRespository;

//    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    @GetMapping("/findAll")
    public Collection<Student> findAll(HttpServletResponse httpServletResponse){
        httpServletResponse.setContentType("text/json;charset=UTF-8");
        return studentRespository.findAll();
    }

}

package com.fanthus.converter;

import com.fanthus.entity.Student;
import org.springframework.core.convert.converter.Converter;

public class StringConverter implements Converter<String, Student> {

    @Override
    public Student convert(String s) {
        //1-zhangsan-22
        String[] args = s.split("-");
        Student student = new Student();
        student.setId(Long.parseLong(args[0]));
        student.setName(args[1]);
        student.setAge(Integer.parseInt(args[2]));
        return student ;
    }
}

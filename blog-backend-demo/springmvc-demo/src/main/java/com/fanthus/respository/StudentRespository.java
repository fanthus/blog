package com.fanthus.respository;

import com.fanthus.entity.Student;

import java.util.Collection;

public interface StudentRespository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}

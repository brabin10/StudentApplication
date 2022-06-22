package com.rabincodes.service;

import java.util.List;

import com.rabincodes.model.Student;

public interface StudentService {

	public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}

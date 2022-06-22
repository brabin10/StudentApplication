package com.rabincodes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabincodes.model.Student;
import com.rabincodes.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository; //inject studentRepository into our service class

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	
	@Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}

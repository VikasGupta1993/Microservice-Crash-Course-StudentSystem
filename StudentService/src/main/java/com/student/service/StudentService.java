package com.student.service;

import com.student.entity.Student;
import com.student.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student getStudentById(int id){
      return studentRepo.findById(id).get();
    }

    public Student insertStudent(Student student){
        return studentRepo.save(student);
    }
}

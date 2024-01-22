package com.student.controller;

import com.student.entity.Library;
import com.student.entity.Student;
import com.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/insert")
    public Student insertStudent(@RequestBody Student student){
        return studentService.insertStudent(student);
    }

    @GetMapping("{id}")
    public Student getStudentById(@PathVariable int id){
        Library library = restTemplate.getForObject("http://localhost:9092/library/"+id,Library.class);
        Student student = studentService.getStudentById(id);
        student.setLibrary(library);
        return student;
    }
}

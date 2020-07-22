package com.redis.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redis.model.Student;
import com.redis.repository.StudentRespository;

@RestController
//@RequestMapping( "/students")
public class StudentController {
    private StudentRespository studentRepository;

    public StudentController(StudentRespository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public Map<String, Student> findAll() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public Student findById(@PathVariable String id) {
        return studentRepository.findById(id);
    }

    @PostMapping("/students")
    public void createStudent(@RequestBody Student student) {
        studentRepository.save(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable String id) {
        studentRepository.delete(id);
    }
}

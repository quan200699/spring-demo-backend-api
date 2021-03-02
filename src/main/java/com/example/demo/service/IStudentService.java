package com.example.demo.service;

import com.example.demo.model.Student;

public interface IStudentService {
    Iterable<Student> findAll();
}

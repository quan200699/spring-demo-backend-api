package com.example.demo.controller;

import com.example.demo.model.Response;
import com.example.demo.model.Student;
import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping
    public Response findAll() {
        Response response = new Response();
        Iterable<Student> students = studentService.findAll();
        response.setData(students);
        response.setMessage("Success");
        response.setStatus(1);
        return response;
    }
}

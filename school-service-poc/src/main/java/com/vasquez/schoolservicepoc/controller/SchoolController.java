package com.vasquez.schoolservicepoc.controller;

import com.vasquez.schoolservicepoc.client.SchoolFeignClient;
import com.vasquez.schoolservicepoc.entity.Student;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class SchoolController {

    //using feign

    private SchoolFeignClient schoolClient;

    @GetMapping(value = "school/student/all")
    public List<Student> getAllStudents(){
        return schoolClient.getStudents();
    }



    @GetMapping(value = "school/student/{id}")
    public Student getStudentById(@PathVariable int id){
        return schoolClient.getStudentById(id);
    }

    @PostMapping(value = "school/student/save")
    public Student getStudentById(@RequestBody Student student){
        return schoolClient.saveStudent(student);
    }



}

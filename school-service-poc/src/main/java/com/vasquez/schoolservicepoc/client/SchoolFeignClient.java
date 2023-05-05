package com.vasquez.schoolservicepoc.client;

import com.vasquez.schoolservicepoc.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "student-service")
public interface SchoolFeignClient {

    @GetMapping(value = "/student/all")
    List<Student> getStudents();


    @GetMapping(value = "/student/{id}")
    Student getStudentById(@PathVariable int id);

    @PostMapping(value = "/student/save")
    Student saveStudent(@RequestBody Student student);

}
package com.vasquez.schoolservicepoc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private String surname;
    private String grade;

}

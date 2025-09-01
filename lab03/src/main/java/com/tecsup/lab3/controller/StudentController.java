package com.tecsup.lab3.controller;

import com.tecsup.lab3.model.Student;
import com.tecsup.lab3.view.StudentReport;

import java.util.Arrays;
import java.util.List;

public class StudentController {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1L, "Ana", "ana@tecsup.edu"),
                new Student(2L, "Luis", "luis@tecsup.edu")
        );

        StudentReport.print(students);
    }
}


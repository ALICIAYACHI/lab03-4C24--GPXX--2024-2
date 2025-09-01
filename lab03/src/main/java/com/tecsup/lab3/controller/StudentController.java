package com.tecsup.lab3.controller;

import com.tecsup.lab3.model.Student;
import com.tecsup.lab3.view.StudentReport;

import java.util.Arrays;
import java.util.List;

public class StudentController {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1L, "María", "maria@tecsup.edu"),
                new Student(2L, "Pedro", "pedro@tecsup.edu"),
                new Student(3L, "Lucía", "lucia@tecsup.edu")
        );

        StudentReport.print(students);
    }
}


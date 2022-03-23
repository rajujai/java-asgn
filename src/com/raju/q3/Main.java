package com.raju.q3;

import com.raju.q1.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<com.raju.q1.Student> studentList = new ArrayList<>();
        studentList.add(new Student(2,"two",800));
        studentList.add(new Student(1,"one",900));
        studentList.add(new Student(4,"four",700));
        studentList.add(new Student(8,"eight",650));
        studentList.add(new Student(5,"five",950));
        List<Employee> employeeList = studentList.stream()
                .map(student -> new Employee(student.getRoll(), student.getName(), student.getMarks()*1000))
                .collect(Collectors.toList());
        System.out.println(employeeList);
    }
}

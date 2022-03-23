package com.raju.q1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(2,"two",800));
        studentList.add(new Student(1,"one",900));
        studentList.add(new Student(4,"four",700));
        studentList.add(new Student(8,"eight",650));
        studentList.add(new Student(5,"five",950));
        List<Student> studentList2 = studentList.stream().filter(student -> student.getMarks()<800).collect(Collectors.toList());
        studentList2.forEach(student -> System.out.println(student));
    }
}

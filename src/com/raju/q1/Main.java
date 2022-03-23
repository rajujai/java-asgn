package com.raju.q1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("HR", new Student(1,"One",800));
        studentMap.put("MH", new Student(2,"Two",900));
        studentMap.put("TN", new Student(3,"Three",500));
        studentMap.put("PB", new Student(4,"Four",400));
        studentMap.put("UK", new Student(5,"Five",550));
        studentMap.put("HP", new Student(6,"Six",700));
        Set<Map.Entry<String, Student>> map = studentMap.entrySet();
        List<Map.Entry<String, Student>> list = new ArrayList<>(map);
        Collections.sort(list, new StudentMarksComparator());
        for (Map.Entry<String, Student> m:list)
            System.out.println(m);
    }
}

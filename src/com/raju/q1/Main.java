package com.raju.q1;

import java.io.*;
import java.nio.file.*;

public class Main {

    public static void main(String[] args){
        Path path;
        try {
            path = Files.createFile(Path.of("student.txt"));
        } catch (IOException e) {
            path = Paths.get("student.txt");
        }
        Student student = new Student(1,"std1", new Address("HR", "Bhiwani", "127000"), "raju@mail.in", "raju");
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream("student.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("serialized the Student object ");
        System.out.println("After Deserialization");
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("student.txt"));
            Student s2 = (Student) ois.readObject();
            System.out.println(s2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package com.raju.q3;

import java.io.*;
import java.nio.file.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        buffered reader
        try {
            BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
            String line=br.readLine();
            System.out.println(line);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        file reader
        try {
            FileReader fr = new FileReader("abc.txt");
            int i=fr.read();
            while( i != -1) {
                System.out.print((char) i);
                i = fr.read();
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //nio file reader
        Path file = Paths.get("abc.txt");
        Stream<String> str= null;
        try {
            str = Files.lines(file);
            str.forEach(line -> System.out.println(line));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

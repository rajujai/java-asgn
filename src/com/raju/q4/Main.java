package com.raju.q4;

public class Main {
    public static void main(String[] args) {
        BNP bnp = new BNP();
        SizeOfPaper s1 = bnp.getSizeOfPaper(10);
        SizeOfPaper s2 = bnp.getSizeOfPaper(100);
        SizeOfPaper s3 = bnp.getSizeOfPaper(1000);
        s1.print();
        s2.print();
        s3.print();
    }
}

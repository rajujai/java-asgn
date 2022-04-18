package com.raju.q4;

public class BNP {
    public SizeOfPaper getSizeOfPaper(int denomiantion){
        if(denomiantion==10) return new s1();
        else if(denomiantion==100) return new s2();
        else if(denomiantion==1000) return new s3();
        return null;
    }
}

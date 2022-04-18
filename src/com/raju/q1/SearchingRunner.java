package com.raju.q1;

public class SearchingRunner {
    public static void main(String[] args) {
        int[] arr={1,3,2}; //unsorted array
        int target=3;
        BinarySearch bs1=new BinarySearch("bubble");
        bs1.binarySearch(arr,target);
        BinarySearch bs2=new BinarySearch("selection");
        bs2.binarySearch(arr,target);
        BinarySearch bs3=new BinarySearch("another");
        bs3.binarySearch(arr,target);
    }
}


package com.raju.q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();
        cityList.add("Delhi");
        cityList.add("Gurugram");
        cityList.add("Bhiwani");
        cityList.add("Noida");
        cityList.add("Chandigrh");
        Collections.sort(cityList, (c1,c2) -> c2.compareTo(c1));
        System.out.println(cityList);
    }
}

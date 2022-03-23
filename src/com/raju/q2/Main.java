package com.raju.q2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("Haryana","Chandigarh");
        map.put("Punjab","Chandigarh");
        map.put("Rajasthan", "Jaipur");
        map.put("Himachal Pardesh", "Shimla");
        map.put("UP", "Lucknow");
        for (String key:map.keySet())
            System.out.println("State: "+key+", Capital: "+map.get(key));
    }
}

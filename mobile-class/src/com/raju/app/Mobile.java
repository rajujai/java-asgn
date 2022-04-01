package com.raju.app;

import java.util.ArrayList;
import java.util.HashMap;

public class Mobile {
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	public String addMobile(String company, String model) {
		if(mobiles.containsKey(company))
			mobiles.get(company).add(model);
		else {
			ArrayList<String> list = new ArrayList<String>();
			list.add(model);
			mobiles.put(company, list);
		}
		return "Mobile added successfully";
	}
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.addMobile("Samsung", "M1");
		mobile.addMobile("Samsung", "M2");
		mobile.addMobile("Samsung", "M5");
		mobile.addMobile("Mi", "M10");
		mobile.addMobile("Mi", "M11");
		ArrayList<String> smg = mobile.getModels("Samsung");
		ArrayList<String> mi = mobile.getModels("Mi");
		System.out.println(smg);
		System.out.println(mi);
	}
	public ArrayList<String> getModels(String company){
		return mobiles.get(company);
	}
}

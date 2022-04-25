package com.raju;

public class Facebook implements SocialMediaConnectionStrategy{

	@Override
	public void connect() {
		System.out.println("Connecting with Lokesh through Facebook");
	}
	
}
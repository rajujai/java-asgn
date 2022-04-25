package com.raju;

public class Twitter implements SocialMediaConnectionStrategy{

	@Override
	public void connect() {
		System.out.println("Connecting with Lokesh through Twitter");
	}

}

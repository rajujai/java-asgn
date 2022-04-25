package com.raju;

public class Main {
	public static void main(String[] args) {
		SocialMediaContext smc = new SocialMediaContext();
		smc.setSocialmediaStrategy(new Facebook());
		smc.connect();
		smc.setSocialmediaStrategy(new Twitter());
		smc.connect();
		smc.setSocialmediaStrategy(new GooglePlus());
		smc.connect();
		smc.setSocialmediaStrategy(new Orkut());
		smc.connect();
	}
}

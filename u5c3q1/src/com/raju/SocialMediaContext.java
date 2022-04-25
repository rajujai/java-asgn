package com.raju;

public class SocialMediaContext {
	SocialMediaConnectionStrategy sm;

	public void setSocialmediaStrategy(SocialMediaConnectionStrategy sm) {
		this.sm = sm;
	}
	void connect() {
		sm.connect();
	}
}

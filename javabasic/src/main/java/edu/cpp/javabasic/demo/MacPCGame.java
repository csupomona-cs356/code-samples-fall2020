package edu.cpp.javabasic.demo;

public class MacPCGame extends PCGame {

	public String getGameName() {
		return "Mac name";
	}
	
	public float getPrice() {
		return 5f;
	}
	
	public String getMacShortcut() {
		return "ctrl + space";
	}
	
	public void test() {
		generateRandomURL();
	}
}

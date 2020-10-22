package edu.cpp.javabasic.demo;

public class AmazonSite {

	public void sellGame(PCGame pcGame) {
		System.out.println("Selling " + pcGame.getGameName());
	}
	
	public void sellGame(MacPCGame pcGame) {
		System.out.println("Selling Game V2 " + pcGame.getGameName());
	}
	
	public void sellToAppleStore(MacPCGame game) {
		System.out.println("Selling " + game.getGameName());
	}
}

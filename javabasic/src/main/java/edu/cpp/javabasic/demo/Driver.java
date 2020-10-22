package edu.cpp.javabasic.demo;

public class Driver {

	public static void main(String[] args) {
		PCGame g1 = new MacPCGame();
		System.out.println(g1.getGameName());
		System.out.println(g1.getPrice());
		((MacPCGame)g1).getMacShortcut();
		
//		PCGame g2 = new WinPCGame();
//		System.out.println(g2.getGameName());
//		System.out.println(g2.getPrice());
//		
//		g1 = g2;
//		System.out.println(g1.getGameName());
//		System.out.println(g1.getPrice());
//				
//		MacPCGame g3 = new MacPCGame();
//		g1 = g3;
//		
//		AmazonSite as = new AmazonSite();
//		as.sellGame(g1);		
//		as.sellGame(g3);
//		
//		as.sellToAppleStore(g3);
		//as.sellToAppleStore(g1);
		
	}

}

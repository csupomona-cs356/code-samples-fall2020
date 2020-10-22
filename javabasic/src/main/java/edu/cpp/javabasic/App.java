package edu.cpp.javabasic;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{


		Game g1 = new Game();
		g1.setName("CS");
		g1.setPrice(30);
		g1.setReview(4.5f);
		
		Game.printInfo();
		XBoxGame.printInfo();
	}
}

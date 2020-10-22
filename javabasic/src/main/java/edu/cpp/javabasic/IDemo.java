package edu.cpp.javabasic;

import java.io.Serializable;

public interface IDemo {
	
	// public static final int passGrade = 60;
	public static final int PASSING_GRADE = 60;
	
	int b = 10; // public static final int b = 10;
	
//	public static void printInfo() {
//		System.out.println("Version 1.0");
//	}
//	
//	default void printScore() {
//		System.out.println("No student info is found.");
//	}
}

abstract class Test  extends App implements IDemo, Serializable, Cloneable {
	
	private String passGrade;
	
	public void test() {
//		System.out.println(IDemo.a);
	}
	
	public void printScore() {
		System.out.println("Here is the new score.");
	}
	
}
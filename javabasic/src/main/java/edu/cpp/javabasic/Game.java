package edu.cpp.javabasic;

import java.io.Serializable;

public class Game implements Serializable {

	private String name;
	private float review;
	private float price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getReview() {
		return review;
	}
	public void setReview(float review) {
		this.review = review;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public static void printInfo() {
		System.out.println("Game info");
	}
}

class XBoxGame extends Game {
	public static void printInfo() {
		System.out.println("XBoxGame info");
	}
}
package edu.cpp.javabasic.oop;

public class PCGame2 {

	private String name;
	private float price;
	private String rating;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		if (price > 1000 || price < 0) {
			throw new RuntimeException();
		}
		this.price = price;
	}
	
	public String getRating() {
		return rating;
	}
	
	public void setRating(String rating) {
		this.rating = rating;
	}
	
}

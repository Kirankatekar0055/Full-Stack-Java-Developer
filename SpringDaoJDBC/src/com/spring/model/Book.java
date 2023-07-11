package com.spring.model;

public class Book 
{
	private int id;
	private String Name;
	private double Price;
	private String Auther;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public String getAuther() {
		return Auther;
	}

	public void setAuther(String auther) {
		Auther = auther;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", Name=" + Name + ", Price=" + Price + ", Auther=" + Auther + "]";
	}
	
	

}

package com.briup.bean;

public class Fruit {
	
	private  long id;
	private String name;
	private String comments;
	private double price;
	
	public Fruit (){}
	
	public Fruit(String name, String comments, double price) {
		this.name = name;
		this.comments = comments;
		this.price = price;
	}
	
	public Fruit(long id, String name, String comments, double price) {
		super();
		this.id = id;
		this.name = name;
		this.comments = comments;
		this.price = price;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + ", comments=" + comments
				+ ", price=" + price + "]";
	}
	
}

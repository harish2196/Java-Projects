package com.chainsys.arraylist;

public class Product {
	int id;
	String name;
	String model;
	double price;
	public Product(int id, String name, String model, double price) {
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return
		"\nid: " + id +
		"\nname: " + name +
		"\nmodel: " + model + "GB" +
		"\nPrice: $" + price;
}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}

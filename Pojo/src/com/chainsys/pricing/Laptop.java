package com.chainsys.pricing;

class Laptop {

	String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private String processor;
	private int ram;
	private int storage;
	private double price;

	public Laptop( String model, String processor, int ram, int storage, double price) {

		this.model = model;
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
		this.price = price;
	}

	@Override
	public String toString() {
		return 
				"\nModel: " + model +
				"\nProcessor: " + processor +
				"\nRAM: " + ram + "GB" +
				"\nStorage: " + storage + "GB SSD" +
				"\nPrice: $" + price;
	}
}
class Mobile {
	String processor1;
	int ram1;
	int storage1;
	double price1;
	public String getProcessor1() {
		return processor1;
	}
	public void setProcessor1(String processor1) {
		this.processor1 = processor1;
	}
	public int getRam1() {
		return ram1;
	}
	public void setRam1(int ram1) {
		this.ram1 = ram1;
	}
	public int getStorage1() {
		return storage1;
	}
	public Mobile(String processor1, int ram1, int storage1, double price1) {
		super();
		this.processor1 = processor1;
		this.ram1 = ram1;
		this.storage1 = storage1;
		this.price1 = price1;
	}
	public void setStorage1(int storage1) {
		this.storage1 = storage1;
	}
	public double getPrice1() {
		return price1;
	}

	public void setPrice(double price) {
		this.price1 = price;
	}
	@Override
	public String toString() {
				return 
				"\nprocessor1: " + processor1 +
				"\nram1: " + ram1  +
				"\nStorage1: " + storage1 + 
				"\nPrice1: $" + price1;
	}

}

class Clothes {
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private String material;
	private String color;
	private String size;
	private double price;

	public Clothes(String material, String color, String size, double price) {
		this.material = material;
		this.color = color;
		this.size = size;
		this.price = price;
	}

	@Override
	public String toString() {
		return 	"\nMaterial: " + material +
				"\nColor: " + color +
				"\nSize: " + size +
				"\nPrice: $" + price;
	}
}


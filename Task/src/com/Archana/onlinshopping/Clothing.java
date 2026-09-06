package com.Archana.onlinshopping;

public class Clothing extends Product{
	private String size;
	public void setSize(String size) {
		this.size=size;
	}
	public String getSize() {
		return size;
	}
	public void displaySizeDetails() {
		System.out.println("size: " + size);
	}
	public static void main(String[] args) {
		Clothing ch=new Clothing();
		ch.setProductName("T-Shirt");
		ch.setPrice(250);
		ch.setSize("M");
		ch.displayProductDetails();
		ch.displaySizeDetails();

	}

}

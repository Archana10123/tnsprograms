package com.Archana.onlinshopping;

public class Electronics extends Product {
	 private String brand;
	 public void setBrand(String brand) {
		 this.brand=brand;
	 }
	 public String getbrand() {
		 return brand;
	 }
	 public void displayBrandDetails() {
		 System.out.println("Brand: " + brand);
	 }
	public static void main(String[] args) {
		Electronics e=new Electronics();
		e.setProductName("Laptop");
		e.setPrice(56000);
		e.setBrand("hp");
		e.displayProductDetails();
		e.displayBrandDetails();

	}

}

package com.Archana.onlinshopping;

public class Product {
	 private String productName;
	 private double price;
	 public void setProductName(String productName) {
		 this.productName=productName;
	 }
	 public String getProductName() {
		 return productName;
	 }
	 public  void setPrice(double price) {
		 this.price=price;
	 }
	 public double getPrice() {
		 return price;
	 }
	 public void displayProductDetails() {
		 System.out.println("productName: " + productName);
		 System.out.println("price: " + price);
	 }
	public static void main(String[] args) {
		Product p=new Product();
		p.setProductName("Laptop");
		p.setPrice(56000);
		p.displayProductDetails();
		

	}

}

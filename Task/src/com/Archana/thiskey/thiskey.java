package com.Archana.thiskey;

public class thiskey {
	thiskey(){
		System.out.println("Default constructor");
	}
	thiskey(String name){
		this();
		System.out.println(name);
	}
	public static void main(String[] args) {
		thiskey t=new thiskey("Archana");
	}
}

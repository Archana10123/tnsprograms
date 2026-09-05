package com.Archana.thiskey;

public class Student {
	int a=10;
	int b=20;
	void show() {
		System.out.println("a = " + this.a);
		System.out.println("b = " + this.b);
	}
	void add() {
		int sum=this.a+this.b;
		System.out.println("Sum = "+ sum);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.show();
		s.add();

	}

}

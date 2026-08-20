package day4;
class demo{
	int age=8;
	public void display() {
	if(age>=18)
	{
		System.out.println("Eligible for voting");
	}
	System.out.println("enter correct age");
	}
}
public class ifelse {
	public static void main(String[] args) {
		demo d=new demo();
		d.display();
	}
}

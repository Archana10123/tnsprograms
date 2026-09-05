package day5;

class Student{
	int a=10;
	public void calculate() {
		if(a<0) {
			System.out.println(a+" ia Negative number");
		}
		else if(a>0) {
			System.out.println(a+" is a Positive number");
		}
		else {
			System.out.println(a+" is Zero");
		}
	}
}
public class Practise {

	public static void main(String[] args) {
		Student s=new Student();
		s.calculate();

	}

}

package day4;
class student{
	int age=18;
	public void display() {
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else {
			System.out.println("Not eligible for voting");
		}
	}
}
public class Ifelseprogram {

	public static void main(String[] args) {
		student s=new student();
		s.display();

	}

}

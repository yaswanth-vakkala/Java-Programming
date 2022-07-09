package cls_java;
import java.util.*;

public class Smtds_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Employee details:");
		System.out.print("Enter the employee name: ");
		String name = s.nextLine();
		System.out.print("Enter the employee number: ");
		int num = s.nextInt();
		System.out.print("Enter employee age: ");
		int age = s.nextInt();
		System.out.print("Enter employee gender: ");
		char gndr = s.next().charAt(0);
		System.out.print("Enter employee salary: ");
		double sal = s.nextDouble();
		System.out.print("Enter the date of joining: ");
		String doj = s.next();
		System.out.print("Enter the no of years of experience: ");
		int exp = s.nextInt();
		System.out.print("Enter employee designation: ");
		s.nextLine();
		String desig = s.nextLine();
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("nubmer: "+num);
		System.out.println("gender: "+gndr);
		System.out.println("salary: "+sal);
		System.out.println("date of joining: "+doj);
		System.out.println("experience: "+exp);
		System.out.println("designation: "+desig);
	}

}

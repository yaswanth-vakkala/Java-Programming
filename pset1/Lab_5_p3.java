package lab;

public class Lab_5_p3 {

	static void Sdetails(String name,int age,int rolln, double per,char g) {
		System.out.println("name of student: "+name);
		System.out.println("age of student: "+age);
		System.out.println("roll no of student: "+rolln);
		System.out.println("student gender: "+g);
		System.out.println("student percentage: "+per);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 21;
		String name = "karl";
		int rollno = 210;
		char gender = 'M';
		double percentage = 91.2;
		Sdetails(name,age,rollno,percentage,gender);
	}	

}

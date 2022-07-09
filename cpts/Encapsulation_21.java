package helloworld;
//encapsulation - binding data with methods
class Student1
{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter and Setters
//	public void setRollno(int r)
//	{
//		rollno = r;
//	}
//	public int getRollno()
//	{
//		return rollno;
//	}
	//instead of manually making getters and setters
//right click in source select generate option
	
	
}

public class Encapsulation_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1();
		s1.setRollno(2);
		System.out.println(s1.getRollno());
		//here obj vars can be accesed using only methods
		s1.setName("ray");
		System.out.println(s1.getName());
		
	}
	//encapsulation makes data secure
}

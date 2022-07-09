package helloworld;

class Emp
{
	int eid;
	int salary;
	static String ceo; //static variables are not obj specific now ceo changes for both if chagned once
	//they are same for all objs, now this variable goes into loader mem instd of hp mem.
	
	static //first executed coz class loads first
	{   // only executed once(on loading of class)
		ceo = "Larry";
		System.out.println("in static");
	}
	public Emp() //second constr
	{
		eid=1;
		salary=2000;//default values
		//for ceo we dont need to specity with each
		//obj as constr is called with each one 
		//we can use static block
		System.out.println("in constructor");
	}
	
	public void show()
	{
		System.out.println(eid+" : "+salary+" : "+ceo );
	}
}

public class Static_keywrd_12 {
//	int i =0; we can't access non static inside static method below for that add static keywrd
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp ram = new Emp();
		ram.eid = 9;
		ram.salary = 5000;
		ram.ceo = "mahesh"; //use only double quotes for strings
				
		Emp rahul = new Emp();
		rahul.eid = 12;
		rahul.salary = 4000;
		rahul.ceo = "mahesh";//for static use class name Emp.ceo instead=(prefered)
		//to access static vars we dont need objs.it also applies to methods
		rahul.ceo = "karl";
	
		ram.show();
		rahul.show();
		// Before creating any object using class we need to load the class
		//coz obj is created in heap memory at first, when we load a class
		//there is a special memory in jvm where we load all class files called
		//class loader memory then we create obj
		
	}

}

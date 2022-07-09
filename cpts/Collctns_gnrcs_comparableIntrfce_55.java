package helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Std implements Comparable<Std> //to sort the elements
{
	int rollno,marks;
	String name;
	public Std(int rollno,String name, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Std [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	//it is used to print values from objs.
	public int compareTo(Std s)//compared to comparator this takes only 1 input
	{
//		return marks>s.marks?1:-1;
		return name.length() > s.name.length()?1:-1;
	}
}

public class Collctns_gnrcs_comparableIntrfce_55 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Std> studs = new ArrayList<>();
		studs.add(new Std(23,"Mahesh",55));
		studs.add(new Std(24,"Sony",64));
		studs.add(new Std(25,"larry",25));
		studs.add(new Std(26,"Joseph",36));
	
	Collections.sort(studs);//we can also pass comparator obj like before (i,j)->i.marks>j.marks?1;-1;

		
	for(Std s : studs)
		System.out.println(s);
	
	}

}
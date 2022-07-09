package helloworld;

class Student
{
	int rollno;
	String name;
}

public class Arrays_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[4]; //arrays are objs in java
		// mandatory to predefine size of arr
//		if we know values before int nums[] = {8,4,43,99};
		System.out.println(nums[2]);
		nums[0] = 8;
		nums[1] = 4;
		nums[2] = 43;
		nums[3] = 99;
//		nums[4] - 3234; overflow error
		System.out.println(nums[1]);
//		System.out.println(nums[5]); overflow error
		for(int i=0;i<4;i++)
			System.out.println(nums[i]);
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		Student s[] = {s1,s2,s3};
	}	

}

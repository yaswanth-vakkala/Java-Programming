package helloworld;

//int,float,double - primitive type(from c)
//Interger - class (pure oop)

public class Wrapper_class_autoboxing_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5; //primitive i is var not oop
//		Integer ii = new Integer(5); //pure oop
		//ii is obj - wrapper class
//instead of 5 if you put a primitive var in obj the concept is called boxing / in java wrapping
		Integer ii = new Integer(i); //wrapping
		int j = ii.intValue();//unwrapping
		//another syntax for same thing
		Integer value = i;//autoboxing
		int k = value; //autounboxing
//for all primitive data types we have a wrapper class
//wrapper classes are slower than primitive
//some frameworks use only wrapper classes. we have 8 wrapper classes
		//we have one more method example
		String str = "123";
		int n = Integer.parseInt(str);//parseint is static method
		System.out.println(n);
	}

}

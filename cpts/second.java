package helloworld;

public class second {
	public static void main(String args[])
	{
		int num = 50; // 4 bytes - 32 bits - -2,147,483,648 to 2,147,483,647
		System.out.println(num);
		num = 10;
		System.out.println(num);
		
		double percent = 2.4;       // 8 bytes
		System.out.println(percent);
		
		float percent1 = 9.4f;        // 4 bytes
		System.out.println(percent1);
		
		short s = 5; // 2bytes(for short integers) - 16 bits - -32768 to 32767
		
		byte b = 5; // 1byte - 8bits - -128 to 127
		
		long l = 5l; //8bytes (for long values)
		
		char c = 'A';
		c = 66; // ASCII value for B
		System.out.println(c); //American stander code for information interchange
		
		double d1 = 5; // implicit conversion
		System.out.println(d1);
		int k = (int)5.6; // type casting(explicit conversion)
		System.out.println(k);
		
	}
}

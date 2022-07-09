package lab;

class Aops
{
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	public void sub(int i, int j)
	{
		System.out.println(i-j);
	}
	public void multiply(int i, int j)
	{
		System.out.println(i*j);
	}
	public void divide(double i, double j)
	{	
		System.out.println(i/j);
	}
	public void rem(int i, int j)
	{
		System.out.println(i%j);
	}
}

public class A_ops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aops obj = new  Aops();
		obj.add(5, 2);
		obj.sub(5, 2);
		obj.multiply(5, 2);
		obj.divide(5, 2);
		obj.rem(5, 2);
	}

}

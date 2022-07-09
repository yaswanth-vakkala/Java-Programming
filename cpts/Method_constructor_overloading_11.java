package helloworld;
//method overloading
class Casio
{
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
	public void add(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}
//	public void add(int i, int j)//gives error
//	{
//		System.out.println(i+j);
//	}
	//try constructor overloading as shown before
}

public class Method_constructor_overloading_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casio obj = new Casio();
		obj.add(4, 2);
		obj.add(2, 2, 9);
	}

}

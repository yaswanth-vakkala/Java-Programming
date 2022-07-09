package lab;

class Ars
{
	public void a_square(int a)
	{
		System.out.println("area of given square is "+a*a);
	}
	public void a_cube(int a)
	{
		System.out.println("area of given cube is "+6 * (a*a));
	}
	public void a_rectangle(int l, int b)
	{
		System.out.println("area of given rectangle is "+ l*b);
	}
	public void a_triangle(int h, int b)
	{
		System.out.println("area of given traingle is "+h*b/2);
	}
}

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ars obj = new Ars();
		obj.a_square(6);
		obj.a_cube(6);
		obj.a_rectangle(5, 6);
		obj.a_triangle(4, 2);
	}

}

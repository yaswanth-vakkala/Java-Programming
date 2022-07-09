package helloworld;
//final for class
final class A4
{
	public void show()
	{//after public add final to prevent it from overriding
		System.out.println("in show");
	}
}
//class B4 extends A4 //error
//{
//	
//}
public class Final_class_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A4 obj = new A4();
		obj.show();
//anyone who extends our class a gets all credit from our work as user only knows about b class
//making classes final prevents from extending them		
		
	}

}

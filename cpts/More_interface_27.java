package helloworld;
//why interfaces
//for generalization
//employer declaring vars and giving employees task to define them
//using apis like fb to communicate with them. it gives idea on what to implement(like which class)
interface Abcd
{
	void show();
}
class Implementer implements Abcd
{
	public void show()
	{
		System.out.println("anything");
	}
}
public class More_interface_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abcd obj = new Implementer();//just like abstract
		obj.show();
	}

}

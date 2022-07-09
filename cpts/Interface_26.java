package helloworld;
//abstract class Writer
//{
//	public abstract void write();
//}
//in future subclasses cant extend to other classes as multiple inheritence is banned
interface Writer
{//interface is just like abstract class but in abs class we can have normal and abs methods but in interface all methods are abs
	public abstract void write(); //void write(); just in short coz by default all methods are abs and public.we cant define them only declare them
}
class Pen implements Writer //we can extend and implement simultaneously
{
	public void write()
	{
		System.out.println("im a pen");
	}
}
class Pencil implements Writer
{
	public void write()
	{
		System.out.println("im a pencil");
	}
}
class Kit
{
	public void doSomething(Writer p)
	{
		p.write();
	}
}
public class Interface_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kit k = new Kit(); //we cant create obj of interface only ref of it
		Writer p = new Pen();
		Writer pc = new Pencil();
		
		k.doSomething(p);
//to make this work for pencil too add Writer
		k.doSomething(pc);
//due to interface we can acheive multiple inheritence
		//interfaces are better to use
	}

}

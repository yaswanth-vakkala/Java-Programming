package helloworld;
//runnable is functional interface and has only 1 method run.and it has lambda exp
class Hi1 implements Runnable
{
	public void run() //original used to be show
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hi");
			try {Thread.sleep(1000);} catch(Exception e){}//checked exception
//1 sec interval is not good.while main working on this method other methods just wait.we need to make other method to run parallely on onther core.
			
		}
	}
}
class Hello1 implements Runnable
{
	public void run()//run as internally start calls run
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hello");
			try {Thread.sleep(1000);} catch(Exception e){}
		}
	}
}

public class Multithrd_runnableInterface_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi1 obj1 = new Hi1();
		Hello1 obj2 = new Hello1();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
	}

}

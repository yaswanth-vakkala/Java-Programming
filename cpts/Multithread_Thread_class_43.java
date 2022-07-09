package helloworld;

class Hi extends Thread
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
class Hello extends Thread
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

public class Multithread_Thread_class_43 {
	//main(single thread) thread by default
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		obj1.start();
		//add delay here
		obj2.start();
//output is diff than expected as both threads start at same time and goes to scheduler at same time somewhere 2 threads will go to it at same time on basis of diff criteria it picks which thread to run first.
//but in this case since our priorites of methods are same randomly threads gets executed
//or just add delay between 2 threads
//		obj1.show();
//		obj2.show();
	}

}

package helloworld;
//our previous code is long.we need decrease size and increase efficieny
public class Multithread_join_isaliveMethod_46 {

	public static void main(String[] args) throws Exception//for join methods 
	{
		// TODO Auto-generated method stub
		Thread t1 = new Thread(() ->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("hi");
				try {Thread.sleep(1000);} catch(Exception e){}//checked exception
				//1 sec interval is not good.while main working on this method other methods just wait.we need to make other method to run parallely on onther core.
	
			}
		});//if we want instad of obj1 just copy the above anonymous function.
		Thread t2 = new Thread(() ->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("hello");
				try {Thread.sleep(1000);} catch(Exception e){}
			}
		});
		
		t1.start();
		try { Thread.sleep(10); } catch(Exception e){}
		t2.start();
		
		System.out.println(t1.isAlive());//is alive checks if thread is active or not
		t1.join();
		t2.join();//join will make main thread wait until both new threads join with it(they only join if their job is completed)
		System.out.println(t1.isAlive());
		System.out.println("bye");//main thread is printing it as it is doing nothing
	}

}

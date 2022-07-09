package helloworld;

class Counter
{
	int count;
	public synchronized void increment()
	{
		count++;//count = count + 1- 2 tasks assignment and add are happenning.
//when 2 threads are running parallel in somewhere btwn execution both threads ask for count same time then instead of incrementing by 2 both increment by 1 in total 1.
//so we want 1 thread at a time only to execute the method.to do this use syncronized.
	}
}

public class Multithread_synchronized_keyword_48 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Counter c = new Counter();
//		c.increment();
		Thread t1 = new Thread(new Runnable() 
			{
				public void run()
				{
					for(int i=1;i<=1000;i++)
					{
						c.increment();
					}
				}
			});
		
		Thread t2 = new Thread(new Runnable() 
		{
			public void run()
			{
				for(int i=1;i<=1000;i++)
				{
					c.increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		//here code is working but main thread instead of waiting it is printing the below code
		t1.join();
		t2.join();
		System.out.println("count "+ c.count);
	}

}

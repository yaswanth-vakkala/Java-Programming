package helloworld;
//our previous code is long.we need decrease size and increase efficieny
public class Multithrd_LambdaExp_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj1 = () ->
						{
							for(int i=1;i<=5;i++)
							{
								System.out.println("hi");
								try {Thread.sleep(1000);} catch(Exception e){}//checked exception
								//1 sec interval is not good.while main working on this method other methods just wait.we need to make other method to run parallely on onther core.
					
							}
						}
				;
		Runnable obj2 = () ->
					{
						for(int i=1;i<=5;i++)
						{
							System.out.println("hello");
							try {Thread.sleep(1000);} catch(Exception e){}
						}
					}
				;
				
		Thread t1 = new Thread(obj1);//if we want instad of obj1 just copy the above anonymous function.
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
	}

}

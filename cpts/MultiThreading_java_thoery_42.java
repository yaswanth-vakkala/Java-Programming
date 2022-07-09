package helloworld;
//when we work with 2 diff apps like typing a doc and listening to song(multitasking).
//behind ms word main process diff sub process are ongoing like spell check ,typing. those subclasses are called threads.
//Thread is a unit of process.when we break process we get threads.
//use of threads
//1.using complete power of cpu- in our world there are multicore processors.
//when we create any java app we only use 1 thread.main is a default thread.
//for ex take an array of 500 elements and we want to multiply each element by 2.it takes some time like 8 sec.
//by default only one core is occupied even if we have mutlicore cpu.to use all cores we need to use all cores,so we create extra threads for all cores to be used
//so we create needed threads and can make main call all of them.The task can be completed much faster.this is the power of multithreading.
//2.asynctask in android- take any app like amazon if we select a product the request will go to server and our app will wait for response and it takes some time,durint this time the app will be freezed.
//but we want to use even while it sends request,so main thread will not send a request instead it will create a new thread which sends request.main will be interacting with user.
//3.web app- when multiple people want to access a server it creates mutiple threads.
//4.game dev- multiple actions at the same time.
//core is actual hardware element but thread is a virtaul one.
class MyThread extends Thread
{
	int[] values = {6,5,1,7,8};
	public void run()//run is responsible to do stuff we want
	{
		for(int i=0;i<5;i++)
		{
			values[i] = values[i]*2;
		}
	}
}
public class MultiThreading_java_thoery_42 {
//so how to acheive threads.(thread is inbuild class)
//Thread t1 = new Thread();-the thread dont know what we want,so we create a class and specify what we want in there
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new MyThread();
		t1.run();//this will call our method,but if want parallel threads we say start and it automatially creats a new thread and call run
//threads have multiple methods.we can also use sleep to make thread wait before running.it is a static methods which takes milli secs as input.
//we can also use weight,audify,stop
//but if we have a class and we want to extends to it.we already have extended default Thread class in java multiple inhere si not possible.so we use interface runnable.
//runnable interface- class MyThread extends A implements Runnable and we get same properties.
//
	}

}

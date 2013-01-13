package stack;

import java.util.ArrayList;
import java.util.List;



public class Main {


	
	public static void main(String[] args)
	{
		MyStack ms = new MyStack(20);
		List<Thread> threads = new ArrayList<Thread>();
		
		for(int i =1; i<=2; i++)
		{
			Runnable task = new Pusher(i, ms);
			Thread worker = new Thread(task);
			worker.setName(String.valueOf(i));
			worker.start();
			threads.add(worker);
		}
		
		for(int i =0; i<=0; i++)
		{
			Runnable task = new Popper(i, ms);
			Thread worker = new Thread(task);
			worker.setName(String.valueOf(i));
			worker.start();
			threads.add(worker);
		}
		
		/**
		for(int i =1; i<=1; i++)
		{
			Runnable worker = new Popper(i, ms);
			executor.execute(worker);
		}
		
		executor.shutdown();
		
		
		
		while(!executor.isTerminated())
		{
			
		}
		
		System.out.println("Finished all threads");
		/**/
	}
}

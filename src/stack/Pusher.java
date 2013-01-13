package stack;

public class Pusher extends Thread implements Runnable{
	private final long id;
	private MyStack ms;
	Pusher(long id, MyStack ms)
	{
		this.id=id;
		this.ms=ms;
	}
	
	@Override
	public void run()
	{
		for(int i = 0; i<=9; i++)
		{
			ms.push(i);
			System.out.println("Pusher " + id + " pushed " + i + " into the stack. Current size: " + (ms.getLastNdx()+1));
		}
	}
}

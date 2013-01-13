package stack;

public class MyStack {
	private int maxSize;
	private int lastNdx;
	private int[] arr;
	public MyStack(int size)
	{
		lastNdx = -1;
		arr = new int[size];
		maxSize=size;
	}
	
	public int getLastNdx()
	{
		return lastNdx;
	}
	
	public synchronized void push(int i)
	{
		if(lastNdx+1 < maxSize)
			arr[++lastNdx]=i;
	}
	
	public synchronized int pop()
	{
		//if(lastNdx-1 > -1)
			//System.out.println(arr[lastNdx] + " was popped");
		return arr[lastNdx--];
	}
}

class Correct_Implementation_of_PC
{
	public static void main(String s[])
	{
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
	}
}
class Q
{
	int n;
	boolean valueSet=false;
	synchronized int get()
	{
		while(!valueSet)
		try
		{
			wait();
		}
		catch(InterruptedException ie) {}
		
		System.out.println("Got:"+n);
		valueSet=false;
		notify();
		return n;
	}
	synchronized void put(int n)
	{
		while(valueSet)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ie) {}
		}
		this.n=n;
		valueSet=true;
		System.out.println("Put:"+n);
		notify();
	}
}
class Producer implements Runnable
{
	Q q;
	Producer(Q q)
	{
		this.q=q;
		new Thread(this,"Producer").start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
		}
	}
}
class Consumer implements Runnable
{
	Q q;
	Consumer(Q q)
	{
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	public void run()
	{
		while(true)
		{
			q.get();
		}
	}
}
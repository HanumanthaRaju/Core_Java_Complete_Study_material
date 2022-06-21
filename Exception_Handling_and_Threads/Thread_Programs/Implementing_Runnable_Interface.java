class A implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Child Thread A: Value of i is:"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {}
		}
	}
}
class Implementing_Runnable_Interface
{
	public static void main(String s[])
	{
		A oa=new A();
		Thread t=new Thread(oa);
		t.start();
		for(int i=0;i<=5;i++)
		{
			System.out.println("Parent Thread: Value of i is:"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {}
		}
	}
}
class A extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Child Thread"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {}
		}
	}
}
class Ex
{
	public static void main(String s[])
	{
		A oa1=new A();
		A oa2=new A();
		oa1.start();
		oa2.start();
		System.out.println("Main thread exiting");		
	}
}
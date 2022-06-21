class A
{
	A()
	{
		System.out.println("Hello A:");
	}
	A(int x)
	{
		this();
		System.out.println(x);
	}
}
public class TestThis5
{
	public static void main(String[] s)
	{
		A oa=new A(10);
	}
}
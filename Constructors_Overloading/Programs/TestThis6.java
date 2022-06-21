class A
{
	A()
	{
		this(5);
		System.out.println("Hello A:");
	}
	A(int x)
	{
		System.out.println(x);
	}
}
public class TestThis6
{
	public static void main(String[] s)
	{
		A oa=new A();
	}
}
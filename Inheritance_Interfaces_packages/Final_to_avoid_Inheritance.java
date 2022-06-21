final class A
{
	void test()
	{
		System.out.println("Can't override");
	}
}
class B extends A
{
	void test()
	{
		System.out.println("Can't override");
	}
}
class Final_to_avoid_Inheritance 
{
	public static void main(String s[])
	{
		A oa=new A();
		oa.test();
		B ob=new B();
		ob.test();
	}
	
}
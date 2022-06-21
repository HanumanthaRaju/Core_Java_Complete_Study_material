class A
{
	String color="White";
	A()
	{
		System.out.println("Default constructor invoked by B");
	}
	void m1()
	{
		System.out.println("m1 in super class-A");
	}
}
class B extends A
{
	String color="Black";
	B()
	{
		//super is used to invoke parent class constructor
		//super();
		System.out.println("Default constructor of B");
	}
	void printcolor()
	{
		System.out.println(color);
		//super is used to refer immediate parent class instance variable
		System.out.println(super.color);
	}
	void m1()
	{
		System.out.println("m1 in sub class-B");
	}
	void m2()
	{
		System.out.println("m2 in sub class-B");
	}
	void m3()
	{
		//super can be used to invoke parent class method
		super.m1();
		m2();
	}
}
class Super_Keyword
{
	public static void main(String s[])
	{
		B ob=new B();
		ob.printcolor();
		ob.m3();
	}
}
class A
{
	A()
	{
		System.out.println("Constructor in A");
	}
}
class B extends A
{
	B()
	{
		//super();
		System.out.println("Constructor in B");
	}
}
class C extends B
{
	C()
	{
		System.out.println("Constructor in C");
	}
}
class Order_of_execution
{
	public static void main(String s[])
	{
		A oa=new A();
		B ob=new B();
		C oc=new C();
	}
}
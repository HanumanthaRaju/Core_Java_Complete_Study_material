class A
{
	int x=10;
	void m1()
	{
		System.out.println("m1 in super class A");
	}
}

class B extends A
{
	void m2()
	{
		System.out.println("m2 in sub class B");
	}
}
class C extends A
{
	void m3()
	{
		System.out.println("m3 in sub class C");
	}
}
class Hierarchical_Inheritance
{
	public static void main(String s[])
	{
		A oa=new A();
		oa.m1();
		//oa.m2();
		
		B ob=new B();
		ob.m1();
		ob.m2();

		C oc=new C();
		oc.m1();
		oc.m2();
		oc.m3();
	}
}
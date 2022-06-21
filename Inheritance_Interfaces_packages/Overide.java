class A
{
	//Accesss modifier in restrictions in decreasing order
	// should be private,default,protected,public
	//private is more restricted then default and default is more restricted than protected and so on
	public void display()
	{
		System.out.println("display in A");
	}
}
class B extends A
{
	public void display()
	{
		System.out.println("display in B");
	}
	
}
class Overide
{
	public static void main(String s[])
	{
		A oa=new A();
		oa.display();
		B ob=new B();
		ob.display();//super class method is overridden
	}
}

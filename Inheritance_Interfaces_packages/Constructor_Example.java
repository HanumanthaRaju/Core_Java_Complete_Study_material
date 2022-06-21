class A
{
	A(int x, double y)
	{
		System.out.println("Parametrized constructor with int and float");
	}
	A(double x,int y)
	{
		System.out.println("Parametrized constructor with float and int");
	}
}

class Constructor_Example
{
	public static void main(String s[])
	{
		//A oa1=new A();
		A oa2=new A(5,12.5);
		A oa3=new A(12.5,5);
	}
}
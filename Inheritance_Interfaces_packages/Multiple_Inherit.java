class A
{  
	void msg()
	{
		System.out.println("Hello");
	}  
}  
class B
{  
	void msg()
	{
		System.out.println("Welcome");
	}  
}  
class Multiple_Inherit extends A,B
{
	//suppose if it were  
   	public static void main(String args[])
	{  
   	Multiple_Inherit obj=new Multiple_Inherit();  
   	obj.msg();//Now which msg() method would be invoked?  
	}  
}  
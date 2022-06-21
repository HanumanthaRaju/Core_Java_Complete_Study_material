interface i1
{  
	void print();  
}  
class Interface_Example implements i1
{  
	public void print()
	{
		System.out.println("Hello");
	}  
	public static void main(String args[])
	{  
		Interface_Example obj = new Interface_Example();  
		obj.print();  
	 }  
}  
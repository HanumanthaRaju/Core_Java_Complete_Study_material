class Method_Overloading
{
	void display()
	{
		System.out.println("Empty display method");
	}
	void display(double i)
	{
		System.out.println("display with double datatype as parameter");
	}
	void display(int i, double x)
	{
		System.out.println("display with int and double datatype as parameter");
	}
	void display(double i, double x)
	{
		System.out.println("display with double and int datatype as parameter");
	}
	public static void main(String s[])
	{
		Method_Overloading m1=new Method_Overloading();
		m1.display(); //Empty display method
		m1.display(5);  //Automatic type conversion is used to match the method
		m1.display(3,5.6); //display with int and double datatype as parameter
		m1.display(4.3,2); //display with int and double datatype as parameter
		m1.display(2.5,3.5); //Automatic type conversion is used to match the method but throws error
	}
}
		
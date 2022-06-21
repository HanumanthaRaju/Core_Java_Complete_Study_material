class LocalVarDemo 
{
	// instance variable with name myVar
	public String myVar="I'm instance variable";
	public void myMethod()
	{
		//local variable with same name myVar as instance variable
		String myVar = "I'm Inside Method";
		System.out.println(myVar);
	}
	public static void main(String args[])
	{
		// Creating object
		//Calling method
		LocalVarDemo obj = new LocalVarDemo();
		System.out.println("Calling Method");
		obj.myMethod();
	
		//calling instance variable
		System.out.println(obj.myVar);
	}

}
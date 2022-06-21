class InvalidAgeException extends Exception
{
	private String detail;
	InvalidAgeException(String s)
	{  
		detail=s;
	}
	public String toString()
	{
		return "This for testing the user defined exception class:["+detail+"]";
	}
}  
class TestCustomException1
{
   static void validate(int age) throws InvalidAgeException
   {  
     if(age<18)  
     	throw new InvalidAgeException("not valid");  
     else  
     	System.out.println("welcome to vote");  
   }  
   public static void main(String args[])
   {  
      try
      {  
      	validate(13);  
      }
      catch(Exception m)
      {
      	System.out.println("Exception occured: "+m);
      }  
      System.out.println("rest of the code...");  
  }  
}  
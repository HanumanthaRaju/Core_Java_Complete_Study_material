//here NumberFormatException was thrown but the actual cause of 
//exception was a null pointer exception.
public class ChainedDemo1
{ 
  public static void main(String[] args) 
  { 
    try
    { 
      NumberFormatException a = new NumberFormatException("====> Exception"); 
      a.initCause(new NullPointerException("====> Actual cause of the exception")); 
      throw a; 
    } 
    catch(NumberFormatException a) 
    { 
      System.out.println(a); 
      System.out.println(a.getCause()); 
    } 
  } 
}
import java.io.IOException; 
class Demo{ 
  void m1() throws IOException
  { 
    throw new IOException("device error"); 
  } 
  void n1() throws IOException
  { 
    m1(); 
  } 
  void p1() 
  { 
    try { 
      n1(); 
    } 
    catch (Exception e) 
    { 
      System.out.println("Exception handled"); 
    } 
  } 
  public static void main(String args[]) 
  { 
    Demo obj = new Demo(); 
    obj.p1(); 
  } 
}

//Java Program to demonstrate the use of the parameterized constructor.  
public class Parametrized_Constructor
{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    Parametrized_Constructor(int i,String n)
    {  
        id = i;  
     name = n;  
    }  
    //method to display the values  
    void display()
    {
        System.out.println(id+" "+name);
        
    }  
    public static void main(String args[])
    {  
        //creating objects and passing values  
        Parametrized_Constructor s1= new Parametrized_Constructor(111,"Karan");  
        Parametrized_Constructor s2 = new Parametrized_Constructor(222,"Aryan"); 
        //calling method to display the values of object  
        s1.display();  
        s2.display();  
   }  
}  
//Java program to overload constructors  
class Overload_Constructor
{  
    	int id;  
    	String name;  
    	int age;  
    	
	//creating two arg constructor  
    	Overload_Constructor(int i,String n)
	{  
    		id = i;  
    		name = n;  
    	}  
    	//creating three arg constructor  
    	Overload_Constructor(int i,String n,int a)
	{  
    		id = i;  
    		name = n;  
    		age=a;  
    	}  
    	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}  
    	public static void main(String args[])
	{  
    		Overload_Constructor s1 = new Overload_Constructor(111,"Karan");  
    		Overload_Constructor s2 = new Overload_Constructor(222,"Aryan",25);  
    		s1.display();  
    		s2.display();  
   }  
}  
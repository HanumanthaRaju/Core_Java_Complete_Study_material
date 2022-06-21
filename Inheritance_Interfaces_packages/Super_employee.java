//the real use of super keyword. 
//Here, Emp class inherits Person class so all the properties of Person 
//will be inherited to Emp by default. 
//To initialize all the property, we are using parent class constructor 
//from child class. In such way, 
//we are reusing the parent class constructor.

class Person
{  
	int id;  
	String name;  
	Person(int id,String name)
	{  
		this.id=id;  
		this.name=name;  
	}  
}  
class Emp extends Person
{  
	float salary;  
	Emp(int id,String name,float salary)
	{  
		super(id,name);//reusing parent constructor  
		this.salary=salary;  
	}  
	void display()
	{	
		System.out.println(id+" "+name+" "+salary);
	}  
}  
class Super_employee
{  
	public static void main(String[] args)
	{  
		Emp e1=new Emp(1,"ankit",45000f);  
		e1.display();  
		Emp e2=new Emp(2,"ant",4000f);  
		e2.display(); 
	}
}  
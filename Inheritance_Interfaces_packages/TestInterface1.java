//Interface declaration: by first user  
interface Drawsolid
{  
	void draw();  
}  
//Implementation: by second user  
class Rectangle implements Drawsolid
{  
	public void draw()
	{
		System.out.println("drawing rectangle");
	}  
}  
class Circle implements Drawsolid
{  
	public void draw()
	{
		System.out.println("drawing circle");
	}
}  
//Using interface: by third user  
class TestInterface1
{  
	public static void main(String args[])
	{  
		Drawsolid d=new Circle();  
		d.draw();  
		Drawsolid d1=new Rectangle();
		d1.draw(); 
		Circle c1=new Circle();
		c1.draw();
		Drawsolid d2;
		Circle c2=new Circle();
		d2=c2;
		d2.draw();
	}
}  
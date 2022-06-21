abstract class Figure
{
	double dim1,dim2;
	Figure(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
	abstract double area();
}

class Rectangle extends Figure
{
	Rectangle(double a,double b)
	{
		super(a,b);
	}
	double area()	
	{
		System.out.println("Inside area for rectangle");
		return dim1*dim2;
	}
}

class Abstract_Areas
{
	public static void main(String s[])
	{
		//Figure f=new Figure(10,10); //This is illegal now

		Rectangle r=new Rectangle(10,10);
		
		Figure figref; //this is ok, no object is created

		figref=r;
		System.out.println("Area of rectangle is:"+figref.area());
	}
}
		

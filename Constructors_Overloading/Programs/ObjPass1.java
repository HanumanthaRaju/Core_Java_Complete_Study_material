class Car
{
	String model;
	Car()
	{
		System.out.println("Car model is:"+model);
	}
	void disp(Car m)
	{
		System.out.println("My Car model is:"+m.model);
	}
}
public class ObjPass1
{
	public static void main(String[] s)
	{
		Car mycar=new Car();
		mycar.model="Ford";
		mycar.disp(mycar);
	}
}
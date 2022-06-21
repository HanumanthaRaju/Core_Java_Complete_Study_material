//Default constructor dispalying default values
public class DefaultvaluesConstructor
{
	int id;
	String name;
	//method to display values of id and string
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String s[])
	{
		DefaultvaluesConstructor s1=new DefaultvaluesConstructor();
		DefaultvaluesConstructor s2=new DefaultvaluesConstructor();
		s1.display();
		s2.display();
	}
}

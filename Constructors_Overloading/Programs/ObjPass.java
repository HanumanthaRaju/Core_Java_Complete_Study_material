public class ObjPass
{
	private int value;

	public static void increment(ObjPass a)
	{
		System.out.println(a);
		a.value++;
	}
	public static void main(String[] args)
	{
		ObjPass p=new ObjPass();
		p.value=5;
		System.out.println("Before:"+p.value);
		increment(p);
		System.out.println("After:"+p.value);
		System.out.println(p);
	}
}
class Ex
{
	public static void main(String[] args)
	{
		A oa1=new A();
		System.out.println(oa1.x);
		oa1.m1();

		oa1.x=20;
		System.out.println(oa1.x);

		A oa2=new A();
		System.out.println(oa2.x);
		oa2.m1();

		oa2=oa1;

		System.out.println(oa2.x);
		oa2.x=50;
		System.out.println(oa1.x);



	}
}
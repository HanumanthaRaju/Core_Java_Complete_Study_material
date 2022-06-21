abstract class RBI
{
	double roi;
	abstract public void rateofinterest();
}
class ICICI extends RBI
{
	public void rateofinterest()
	{
		roi=8.5;
		System.out.println("Rate of interest in ICICI:"+roi);
	}
}
class HDFC extends RBI
{
	public void rateofinterest()
	{
		roi=8;
		System.out.println("Rate of interest in HDFC:"+roi);
	}
}
public class Test_Abstract_Bank
{
	public static void main(String s[])
	{
		//RBI obj=new RBI; //Not valid

		ICICI i1=new ICICI();
		HDFC h1=new HDFC();

		RBI ref;
		
		i1.rateofinterest();
		h1.rateofinterest();

		ref=i1;
		ref.rateofinterest();
	
		ref=h1;
		ref.rateofinterest();
	}
}
		
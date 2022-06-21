public class Main2
{
	public static void main(String args[]) {
		int d, a;
		try { // monitor a block of code.
			d = 0;
			a = 42 / d;
			System.out.println("This will not be printed.");
		} 
		catch(ArithmeticException e)
		{
			System.out.println("Multiple catch");
		}
		catch (Exception e) { // catch divide-by-zero error
			System.out.println("Hello world");
			System.out.println(e);
		}
		finally
		{
			System.out.println("In finally block");
		}
		System.out.println("After catch statement.");
		System.out.println("testing");
	}
}
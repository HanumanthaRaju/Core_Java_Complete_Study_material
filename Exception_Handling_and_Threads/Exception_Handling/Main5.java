/* Try statements can be implicitly nested via calls to methods. */
public class Main5
{
	static void nesttry(int a) {
		try { // nested try block
			if(a==1) 
				a = a/(a-a); // division by zero
			if(a==2) {
				int c[] = { 1 };
				c[42] = 99; // generate an out-of-bounds exception
			}
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out-of-bounds: " + e);
		}
	}
	public static void main(String args[]) {
		try {
			int a = 2;
			int b = 42 / a;
			System.out.println("a = " + a);
			nesttry(a);
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by 0: " + e);
		}
	}

}
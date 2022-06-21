public class String_Methods_Example
{
	public static void main(String s[])
	{
	// create a string
    String greet = "Hello! World";
    System.out.println("The string is: " + greet);
    //checks the string length
    System.out.println("The length of the string: " + greet.length());

     // create string
    String greet1 = "Hello! ";
    System.out.println("First String: " + greet1);

    String name = "World";
    System.out.println("Second String: " + name);

    // join two strings
    String joinedString = greet1.concat(name);
    System.out.println("Joined String: " + joinedString);

     // create string
    String greet2 = "Hello! ";
    System.out.println("First String: " + greet2);

    String name1 = "World";
    System.out.println("Second String: " + name1);

    // join two strings
    String joinedString1 = greet2 + name1;
    System.out.println("Joined String: " + joinedString1);

    // create strings
    String first = "java programming";
    String second = "java programming";
    String third = "python programming";

    // compare first and second strings
    boolean result1 = first.equals(second);
    System.out.println("Strings first and second are equal: " + result1);

    //compare first and third strings
    boolean result2 = first.equals(third);
    System.out.println("Strings first and third are equal: " + result2);

    // returns the character at 3
    System.out.println("The character at 3: " + greet.charAt(3));

    // returns the character at 7
    System.out.println("The character at 7: " + greet.charAt(7));

     // create string using the new keyword
    String example = new String("Hello! World");

    // returns the substring World
    System.out.println("Using the subString(): " + example.substring(7));

    // converts the string to lowercase
    System.out.println("Using the toLowerCase(): " + example.toLowerCase());

    // converts the string to uppercase
    System.out.println("Using the toUpperCase(): " + example.toUpperCase());

    // replaces the character '!' with 'o'
    System.out.println("Using the replace(): " + example.replace('!', 'o'));
	}
}
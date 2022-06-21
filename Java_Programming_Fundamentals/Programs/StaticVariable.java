//Unlike the Local and Instance variable (where we can not use static), we 
//have another variable type which is declared as static and is known as 
//Static or Class variable
//Given below are some of the properties of the Static or Class variable:
//These variables cannot be local.
//Static variables are shared among all the instances of a class.
//The default values of Static/Class variables are the same as the Instance 
//variables.
//Static variables can be used within a program by calling the 
//className.variableName
//The memory allocated to store Static variables is Static memory.
//In the below program, we are calculating the circumference of a circle by 
//using a private variable radius and a constant pi. Both these variables 
//are declared as static.

public class StaticVariable {
     
    // radius is declared as private static
    private static int radius;
     
    // pi is a constant of type double declared as static
    private static final double pi = 3.14;
 
    public static void main(String[] args) {
         
        // assigning value of radius
        radius = 3;
         
        // calculating and printing circumference
        System.out.println("Circumference of a circle is: " + 2*pi*radius);
 
    }
 
}
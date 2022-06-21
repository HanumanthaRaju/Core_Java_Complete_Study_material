//Instance variables are those variables that are declared inside a class. 
//Unlike Local variables, these variables cannot be declared within a block, 
//method, or constructor.
//Enlisted below are the properties of the Instance variable:
//They are declared within a class but outside a block, method or 
//constructor.
//It cannot be defined by a static keyword.
//Unlike Local variables, these variables have a default value.
//The integer type has a default value ‘0’ and the boolean type has the
//default value ‘false’.
//Unlike Local variables, we have access modifiers for Instance variables.
//Given below is the program where we have demonstrated the instance variable.
// We have declared variables outside the main method 
//and then assigned the values to them by using objects 
//keeping one variable the number unassigned.
//Finally, we have printed the values of these Instance variables 
//and the unassigned variable number has printed ‘0’ by default.


public class instance {
     
    // Declaring instance variables
        public int rollNum; 
        public String name; 
        public int totalMarks;
        public int number;
     
    public static void main(String[] args) {
         
        // created object
        instance in = new instance();
        in.rollNum = 95;
        in.name = "Saket";
        in.totalMarks = 480;
         
        // printing the created objects
        System.out.println(in.rollNum);
        System.out.println(in.name);
        System.out.println(in.totalMarks);
         
        /*
         * we did not assign the value to number so it 
         * will print '0' by default
         */
        System.out.println(in.number);
 
    }
 
}
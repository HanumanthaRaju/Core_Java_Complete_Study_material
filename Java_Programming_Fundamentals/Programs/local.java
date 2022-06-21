//These variables are declared inside the body of a method. 
//These can be used within the same method where it is being initialized.
//Some of the properties of a Local Variable include:
//Local variables are declared inside a method, constructor, or block.
//No access modifiers for local variables.
//These can be used only within the same block, method, or constructor where it is initialized.
//No default value after you have declared your local variable. You need to initialize your declared local variable.
//It can’t be defined by a static keyword.
//Given below is the program in which we have used local variables 
//initialized within a method of a class. 
//As height is a local variable initialized with the calculate() method, 
//the scope of this variable will be confined within the method.

public class local {
     
    public void calculate() {
         
        // initialized a local variable height
        int height = 0;
         
        // incrementing the value of height
        height = height + 170;
        System.out.println("height is: " + height + " cm");
    }
 
    public static void main(String args[]) {
         
        // a is a reference used to call calculate() method
        local a = new local();
        a.calculate();
    }
}
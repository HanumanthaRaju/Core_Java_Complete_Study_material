//Java Program to demonstrate the use of break statement  
//inside the while loop.  
public class BreakWhileExample {  
public static void main(String[] args) {  
    //while loop  
    int i=1;  
    while(i<=10){  
        if(i==5){  
            //using break statement  
            i++;  
            break;//it will break the loop  
        }  
        System.out.println(i);  
        i++;  
    }  
}  
}  
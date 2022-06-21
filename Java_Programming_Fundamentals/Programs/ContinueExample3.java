//Java Program to illustrate the use of continue statement  
//with label inside an inner loop to continue outer loop  
public class ContinueExample3 {  
public static void main(String[] args) {  
            aa:  
            for(int i=1;i<=3;i++){    
                    bb:  
                    for(int j=1;j<=3;j++){    
                        if(i==2&&j==2){    
                            //using continue statement with label  
                            continue aa;    
                        }    
                        System.out.println(i+" "+j);    
                    }    
            }    
}  
}
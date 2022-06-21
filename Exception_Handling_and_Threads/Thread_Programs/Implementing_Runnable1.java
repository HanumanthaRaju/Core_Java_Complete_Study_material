class Implementing_Runnable1 implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
Implementing_Runnable1 m1=new Implementing_Runnable1();  
Thread t1 =new Thread(m1);  
t1.start();  
 }  
}  
class Extending_Thread1 extends Thread{  
public void run(){  
System.out.println("thread is running...");
for(int i=0;i<10;i++)
	System.out.println("the value of i:"+i);
}  
public static void main(String args[]){  
Extending_Thread1 t1=new Extending_Thread1();  
t1.start();
System.out.println("Main thread is running");
 }  
}  


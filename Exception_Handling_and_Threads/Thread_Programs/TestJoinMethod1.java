class TestJoinMethod1 extends Thread{  
 public void run(){  
  for(int i=1;i<=5;i++){  
   try{  
    Thread.sleep(500);  
   }catch(Exception e){System.out.println(e);}  
  System.out.println(i);  
  }  
 }  
public static void main(String args[]){  
 TestJoinMethod1 t1=new TestJoinMethod1();  
 TestJoinMethod1 t2=new TestJoinMethod1();  
 TestJoinMethod1 t3=new TestJoinMethod1();   
 try{  
 	t1.start();
 	t2.start();
  	t1.join();  
  	t2.join();
 }catch(Exception e){System.out.println(e);}  
  
 
 t3.start();  
 }  
}  
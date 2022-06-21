public class JavaIsAliveExp extends Thread   
{  
    public void run()  
    {  
        try   
        {  
            //Thread.sleep(0);  
            System.out.println("is run() method isAlive "+Thread.currentThread().isAlive());  
        }  
        catch (Exception ie) {  
        }  
    }  
    public static void main(String[] args)  
    {  
        JavaIsAliveExp t1 = new JavaIsAliveExp();  
        System.out.println("before starting thread isAlive: "+t1.isAlive());  
        t1.start();  
        System.out.println("after starting thread isAlive: "+t1.isAlive());  
        System.out.println("after starting thread isAlive: "+t1.isAlive());  
        System.out.println("after starting thread isAlive: "+t1.isAlive());  
        System.out.println("after starting thread isAlive: "+t1.isAlive());  
        System.out.println("after starting thread isAlive: "+t1.isAlive());  
        System.out.println("after starting thread isAlive: "+t1.isAlive());  
        System.out.println("after starting thread isAlive: "+t1.isAlive());  
        System.out.println("after starting thread isAlive: "+t1.isAlive());  
    }  
}  
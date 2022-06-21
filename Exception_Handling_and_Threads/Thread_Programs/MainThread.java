class MainThread
{  
   public static void main(String args[])
   {
       Thread obj = Thread.currentThread();
       System.out.println("Name of thread :" +obj.getName());
       System.out.println("Priority of thread :" +obj.getPriority());
       System.out.println("Thread details are:"+obj);
       // We can set the Name of main thread
       obj.setName("Main thread");
       System.out.println("Name of thread :" +obj.getName());
       System.out.println("Hello world");
   }  
}  
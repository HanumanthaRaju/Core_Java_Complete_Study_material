public class Copy_Constructor_without_Constructor
{  
    int id;  
    String name;  
    Copy_Constructor_without_Constructor(int i,String n)
    {  
        id = i;  
        name = n;  
    }  
    Copy_Constructor_without_Constructor(){}  
    
    void display()
    {
        System.out.println(id+" "+name);
    }  
   
    public static void main(String args[])
    {  
        Copy_Constructor_without_Constructor s1 = new Copy_Constructor_without_Constructor(111,"Karan");  
        Copy_Constructor_without_Constructor s2 = new Copy_Constructor_without_Constructor();  
        s2.id=s1.id;  
        s2.name=s1.name;  
        s1.display();  
        s2.display();  
   }  
}  
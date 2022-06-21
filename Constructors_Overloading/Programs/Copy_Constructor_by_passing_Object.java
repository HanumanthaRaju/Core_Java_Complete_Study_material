public class Copy_Constructor_by_passing_Object
{  
    int id;  
    String name;  
    //constructor to initialize integer and string  
    Copy_Constructor_by_passing_Object(int i,String n)
    {  
        id = i;  
        name = n;  
    }  
    //constructor to initialize another object  
    Copy_Constructor_by_passing_Object(Copy_Constructor_by_passing_Object s)
    {  
        id = s.id;  
        name =s.name;  
    }  
    void display()
    {
        System.out.println(id+" "+name);
    }  
   
    public static void main(String args[])
    {  
        Copy_Constructor_by_passing_Object s1 = new Copy_Constructor_by_passing_Object(111,"Karan");  
        Copy_Constructor_by_passing_Object s2 = new Copy_Constructor_by_passing_Object(s1);  
        s1.display();  
        s2.display();  
   }  
}  
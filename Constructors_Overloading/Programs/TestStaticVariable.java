class StaticDemo
{
    static int a=10;    //class variable
    int b=10;           //instance variable
    
    public void display()
    {
        a=a+10;
        b=b+10;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
public class TestStaticVariable
{
    public static void main(String s[])
    {
        StaticDemo obj1=new StaticDemo();
        StaticDemo obj2=new StaticDemo();
        obj1.display();     //a=20 b=20
        obj2.display();     //a=30 b=20
    }
}

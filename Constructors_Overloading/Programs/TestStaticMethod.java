class Test
{
    static int a=10;
    public static void display()
    {
        a=a=20;
    }
}

public class TestStaticMethod
{
    public static void main(String s[])
    {
        System.out.println("Hello World");
        Test.display();
        System.out.println("a:"+Test.a);
        Test obj=new Test();
        obj.display();
        System.out.println("a:"+Test.a);
    }
}

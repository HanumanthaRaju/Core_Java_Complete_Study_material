// Java program to demonstrate objects passing to methods.
class ObjectPassDemo {
    int a, b;
    ObjectPassDemo(int i, int j) {
        a = i;
        b = j;
    }
    // return true if o is equal to the invoking
    // object notice an object is passed as an
    // argument to method
    boolean equalTo(ObjectPassDemo o) {
        return (o.a == a && o.b == b);
    }
}
// Driver class
public class Test {
    public static void main(String args[]) {
        ObjectPassDemo ob1 = new ObjectPassDemo(100, 22);
        ObjectPassDemo ob2 = new ObjectPassDemo(100, 22);
        ObjectPassDemo ob3 = new ObjectPassDemo(-1, -1);
        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}
class Keword_this_is_not_required{  
int rollno;  
String name;  
float fee;  
Keword_this_is_not_required(int r,String n,float f){  
rollno=r;  
name=n;  
fee=f;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
public class TestThis3{  
public static void main(String args[]){  
Keword_this_is_not_required s1=new Keword_this_is_not_required(111,"ankit",5000f);  
Keword_this_is_not_required s2=new Keword_this_is_not_required(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  
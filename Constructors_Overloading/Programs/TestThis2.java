class Solution_using_this_keyword{  
int rollno;  
String name;  
float fee;  
Solution_using_this_keyword(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
public class TestThis2{  
public static void main(String args[]){  
Solution_using_this_keyword s1=new Solution_using_this_keyword(111,"ankit",5000f);  
Solution_using_this_keyword s2=new Solution_using_this_keyword(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  
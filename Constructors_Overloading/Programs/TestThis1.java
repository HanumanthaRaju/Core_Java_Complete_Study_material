class Without_this_Keyword{  
int rollno;  
String name;  
float fee;  
Without_this_Keyword(int rollno,String name,float fee){  
rollno=rollno;  
name=name;  
fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
public class TestThis1{  
public static void main(String args[]){  
Without_this_Keyword s1=new Without_this_Keyword(111,"ankit",5000f);  
Without_this_Keyword s2=new Without_this_Keyword(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  
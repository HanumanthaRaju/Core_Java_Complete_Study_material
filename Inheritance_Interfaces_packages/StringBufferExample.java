public class StringBufferExample
{  
	public static void main(String args[])
	{  
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java

		sb.replace(1,3,"Java");  
		System.out.println(sb);//prints HJavalo    

		StringBuffer sb1=new StringBuffer("Hello");  
		sb1.delete(1,3);  
		System.out.println(sb1);//prints Hlo  

		StringBuffer sb2=new StringBuffer("Hello"); 
		sb2.reverse();  
		System.out.println(sb2);//prints olleH  

		StringBuffer sb3=new StringBuffer();  
		System.out.println(sb3.capacity());//default 16  
		sb3.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		sb3.append("java is my favourite language");  
		System.out.println(sb3.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  

		StringBuffer sb4=new StringBuffer();  
		System.out.println(sb4.capacity());//default 16  
		sb4.append("Hello");  
		System.out.println(sb4.capacity());//now 16  
		sb4.append("java is my favourite language");  
		System.out.println(sb4.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		sb4.ensureCapacity(10);//now no change  
		System.out.println(sb4.capacity());//now 34  
		sb4.ensureCapacity(50);//now (34*2)+2  
		System.out.println(sb4.capacity());//now 70  
	}
}  
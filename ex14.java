
import java.util.*;
import java.lang.*;
class Rextester
{  
	 int id;  
	    String name;  
	    int age;  
	   Rextester(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	   Rextester(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+age);}  
	    public static void main(String args[]){  
	    Rextester s1 = new Rextester(111,"Karan");  
	    Rextester s2 = new Rextester(222,"Aryan",25);  
	    s1.display();  
	    s2.display();  
	   }  
}  

	 


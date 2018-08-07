import java.util.*;
import java.lang.*;
class Rextester
{  
	  
	    int id;  
	    String name;  
	    Rextester(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	      
	    Rextester(Rextester s)
        {  
	    id = s.id;  
	    name =s.name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    Rextester s1 = new Rextester(111,"Karan");  
	   Rextester s2 = new Rextester(s1);  
	    s1.display();  
	    s2.display();  
	   }  
       }  



	 

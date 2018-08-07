import java.util.*;
import java.lang.*;

class ex2
{  
  
  
	 
	 int rollno;  
	 String name;  
	  
	 void insertRecord(int r, String n){  
	  name=n;  
	 }  
	  
	 void displayInformation(){System.out.println(rollno+" "+name);}
	 public static void main(String args[]){  
	 ex2 s1=new ex2();  
   ex2 s2=new ex2();  
	  
	  s1.insertRecord(11,"Karan");  
	  s2.insertRecord(22,"Aryan");  
	  
	  s1.displayInformation();  
      s2.displayInformation();  
  
	 }  
	}  

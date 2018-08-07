import java.util.*;
import java.lang.*;

class ex4
{  
  
 
	 void fact(int  n){  
	  int fact=1;  
	  for(int i=1;i<=n;i++){  
	   fact=fact*i;  
  }  
	 System.out.println("factorial is "+fact);  
	}  
  
 public static void main(String args[]){  
	 new ex4().fact(5);  
	}  
	}

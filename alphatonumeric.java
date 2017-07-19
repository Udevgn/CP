/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	  String numbers [] = {"one","two","three","four","five","six","seven","eight","nine"};
	  String places1[] = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	  String places2[] = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	  String places3[] = {"hundred"};
	  String places4[] = {"thousand"};
	  Scanner in = new Scanner(System.in);
	  int number = in.nextInt();
	  String str = String.valueOf(number);
	  int len  = str.length();
	  String initial ="";
	  if(len == 1)
	  {
	     initial = numbers[str.charAt(0)-'0'-1];
	  }
	  else
	  if(len == 2)
	  {
	      if(str.charAt(str.length()-1)-'0' == 1)
	      {
	          initial = numbers[str.charAt(0)-'0'];
	          
	      }
	      else
	      {
	          initial = places2[str.charAt(0)-'0'-1]+" "+numbers[str.charAt(1)-'0'-1];
	      
	          
	      }
	      
	      
	      
	  }
	  if(len == 3)
	  {
	      
	    initial = numbers[str.charAt(0)-'0'-1]+"hundred";
	     
	      if(str.charAt(str.length()-2)-'0' == 1)
	      {
	          initial = initial+" "+numbers[str.charAt(1)-'0'-1];
	          
	      }
	      else
	      {
	          initial = initial+" "+places2[str.charAt(1)-'0'-1]+" "+numbers[str.charAt(2)-'0'-1];
	      
	          
	      }
	      
	      
	      
	  }
	  if(len == 4)
	  {    
	        initial = numbers[str.charAt(0)-'0'-1]+"thousand";
	        initial = initial+" "+numbers[str.charAt(1)-'0'-1]+"hundred";
	     
	      if(str.charAt(str.length()-2)-'0' == 1)
	      {
	          initial = initial+" "+numbers[str.charAt(2)-'0'-1];
	          
	      }
	      else
	      {
	          initial = initial+" "+places2[str.charAt(2)-'0'-2]+" "+numbers[str.charAt(3)-'0'-1];
	      
	          
	      }
	      
	      
	      
	  }
	  System.out.println(initial);
	  
	}
}

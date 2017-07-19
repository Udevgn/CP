/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{    Scanner in = new Scanner(System.in);
	     String str = in.next();
	     StringBuffer sb = new StringBuffer();
	     for(char ch: str.toCharArray())
	     {
	         if(sb.indexOf(ch+"")== -1)
	         sb.append(ch);
	     }
	     int min_window_len = Integer.MAX_VALUE;
	     int checked[] = new int[sb.length()];
	     int len=0;
	     int left_lim=0;
	     for(int i=0;i<str.length();i++)
	     {
	         
	         if(sb.indexOf(str.substring(i,i+1))!= -1 && checked[sb.indexOf(str.substring(i,i+1))] != 1 )
	         { 
	            checked[sb.indexOf(str.substring(i,i+1))] = 1;
	            len++;
	           
	           // int flag=0;
	            if(len == sb.length())
	            {   len = 0;
	                
	                String s = str.substring(left_lim,i+1);
	                 
	                while(true)
	                {
	                    
	                    if(s.substring(left_lim+1,i+1).indexOf(s.substring(left_lim,left_lim+1)) == -1)
	                    {
	                        if(min_window_len>i-left_lim+1)
	                         min_window_len = i-left_lim+1;
	                         break;
	                    }
	                    else 
	                    {
	                        left_lim++;
	                        if(left_lim == str.length())
	                        break;
	                    }
	                }
	                Arrays.fill(checked,0);
	            }
	         }
	     }
	     System.out.println(min_window_len);
	     
	     
	}
}

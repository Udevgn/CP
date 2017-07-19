import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
	
	 Scanner in = new Scanner(System.in);
	 
	 int T = in.nextInt();
	 for(int t=0;t<T;t++)
	 {
	 String string = in.next();
	 String text = in.next();
	 int no_ofstates = text.length();
	 char strarray[] = new char[string.length()];
	 char textarray[] = new char[text.length()];
	 strarray = string.toCharArray();
	 textarray = text.toCharArray();
	 int state=0;
	 int counter=0;
	 for(int i=0;i<string.length();i++)
	 { 
	     if(strarray[i] == textarray[state])
	     {
	         state++;
	         counter++;
	         if(state == text.length())
	         {
	             System.out.println(counter+"");
	             break;
	         }
	     }
	     else if(!(strarray[i] == textarray[state]))
	    {
	        int flag = 0;
	        for(int k=0;k<text.length();k++)
	        {
	            if(strarray[i] == textarray[k])
	                {
	                    state = 0;
	                    flag = 1;
	                    break;
	                }
	         
	         
	        }
	        if(flag == 1)
	            {
	                state = 0;
	                counter = 0;
	            }
	        else if(flag == 0)
	            {
	                counter++;
	            }
	    }
	     
	     
	 }
	 
	     
	 }
	
	 
	
	
	
	}
}
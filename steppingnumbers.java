/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		for(int number = n;number<=m;number++)
		{
		    String no = String.valueOf(number);
		    int arr[] = new int[no.length()];
		    for(int i=0;i<arr.length;i++)
		    {
		        arr[i] = Integer.valueOf(String.valueOf(no.charAt(i)));
		        
		    }
		   
		   int flag = 0;
		   for(int i=1;i<arr.length;i++)
		   {
		       if(Math.abs(arr[i]-arr[i-1]) != 1)
		       
		       {
		           flag =1;
		       }
		   }
		    if( flag !=1)
		    {
		        System.out.println(no+"is a stepping number");
		    }
		    
		    else
		     System.out.println(no+"is not  a stepping number");
		    
		}
	}
}

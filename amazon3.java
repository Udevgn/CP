import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	   
	   Scanner in = new Scanner(System.in);
	   int T = in.nextInt();
	   for(int t = 0;t<T;t++){
	   int n= in.nextInt();
	   int array[] = new int[n];
	   for(int i =0;i<n;i++){
	       int start = 0;
	       int end = n-1;
	       int flag= 0 ;
	       while(start !=i && end != i)
	       {
	           
	        
	         if((array[start]> array[i]) || (array[end] <array[i])){
	             break;
	         }
	         if(start<i && end>i)
	         {
	             
	             if(start <i && array[start]<=array[i])
	             {
	                 start++;
	             }
	             if(end>i && array[end] >=array[i])
	             {
	                 end--;
	             }
	             
	             
	         }
	            if(start == end)
	         {
	           flag =1;
	           break;
	           
	         }
	         
	       }
	       if(flag == 1)
	       	System.out.println(array[i]+"");
	       
	       else
	       	System.out.println(-1+"");
	       	
	       	//System.out.print("\n");

	   }
	  }
	}
 }
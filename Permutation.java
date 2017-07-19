

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{  
    static  void permutation(int arr[],int s,int e)
     {
         if(s == e){
             for(int i=0;i<=e;i++)
             System.out.print(arr[i]+"");
             System.out.println("");
             
         }
         for(int i=s;i<=e;i++){
             int temp = arr[i];
             arr[i]   = arr[s];
             arr[s]   = temp;
               permutation(arr,s+1,e);
             
           
             
             
         }
     }
	public static void main (String[] args) throws java.lang.Exception
	{
     
      int arr[] = {1,5,2,4};
      permutation(arr,0,arr.length-1);
	}
}

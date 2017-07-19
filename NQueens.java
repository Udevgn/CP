import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
     
     public static boolean isSafe(int arr[][],int row,int col)
     {
         for(int i=row,i<arr.length;i++)
         {
          
           if(arr[i][col] == 1)
             return false;
             
         }
         for(int i=row,int j=col;i<n,j<n;i--,j--){
             if(arr[i][j] == 1)
             return false;
         }
         for(int i=row,int j=col;i<n,j<n;i++,j--){
             if(arr[i][j] == 1)
             return false;
         }
         
         return true;
     }
     
     static boolean NQueens(int arr[][],int col){
         
         
         for(int i=0;i<arr.length;i++){
             if(isSafe(arr,i,col)){
                 arr[i][col] = 1;
             }
             if(NQueens(arr,col+1)){
                 return true;
             }
             arr[i][col] = 0;
             
        
         }
         return false;
     }
   
	public static void main (String[] args) throws java.lang.Exception
	{
		
		
		
		 
	}
}



import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    //Scanner in = new Scanner(System.in);
	    String book = "please baby please open your heart baby catch my disease heart baby you are my heart";
	    String keyword[] = new String[100];
	    String word1 = "baby";
	    String word2 = "heart";
	    int index =-1;
	    int indexes1[]= new int[100];
	    int indexes2[] = new int[100];
	    int i=0;
	    int j=0;
	    int length = 0;
	    int distances[] = new int[100];
	    keyword = book.split(" ");
	    while((index = Arrays.asList(keyword).indexOf(word1))!= -1){
	        indexes1[i++] = index;
	        keyword = keyword.substring(index+1,keyword.length);
	        }
	    while((index = Arrays.asList(keyword).indexOf(word2))!= -1){
	        indexes2[i++] = index;
	        keyword = String.valueOf(keyword);
	        }
	    length = (indexes1.length>=indexes2.length)?indexes2.length:indexes1.length;
	    i=0;
	    while(i<length){
	       distances[i] = Math.abs(indexes1[i]-indexes2[i]);
	       i++;
	    }
	    int min = Integer.MAX_VALUE;
	    for(int k=0;k<length;k++){
	        if(distances[k]<min){
	            min = distances[k];
	        }
	    }
	   System.out.println("minimum distance is->"+(min));
	        
	
	
	
	
	
	
	}
}

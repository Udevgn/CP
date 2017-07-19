/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   //Scanner in = new Scanner(System.in);
		HashMap<String,Integer> dict = new HashMap<String,Integer>();
	    String book = "hello my peeps my heart is falling for you, u c deeps";
	    //in.next();
	    String tokenized [] = new String[100];
	    tokenized = book.split(" ");
	    for(int i=0;i<tokenized.length;i++)
	    {
	        if(dict.containsKey(tokenized[i])){
	            dict.put(tokenized[i],(dict.get(tokenized[i])+1));
	            
	        }
	        else                      
	        dict.put(tokenized[i],1);
	        
	        
	        
	        
	        
	    }
	    for(Map.Entry<String,Integer> keywords:dict.entrySet()){
	        System.out.print(keywords.getKey()+"->"+keywords.getValue());
	    }
	}
}

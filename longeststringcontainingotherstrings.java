

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String keywords[] = {"testingtester","testertest","testing", "tester","test"};
		List list = Arrays.asList(keywords);
		//ListIterator listitr = list.listIterator();
		int counts[] = new int[5];
		int pos=0;
		for(int i=0;i<list.size();i++){
		   
		      pos = -1;
		    for(int j=0;j<list.size();j++){
		        String keyword = (String)list.get(i);
		        if(i==j)
		        continue;
		        String cmp = (String)list.get(j);
		        int index = keyword.indexOf(cmp);
		        //System.out.println(index);
		        if(index!=-1 && index<keyword.length())
		         counts[i]++;
		      //  keyword = keyword.substring(0,index)+keyword.substring(index+cmp.length(),keyword.length());
		        //System.out.println(keyword);
		       /* if(keyword.equals(""))
		        {
		            pos = i;
		            break;
		        }*/
		        
		    }
		   // if(pos!=-1)
		    //System.out.println("->"+list.get(pos));
		}
		int max = 0;
		int p =0;
		for(int i=0;i<counts.length;i++){
		    if(counts[i]>max){
		    max = counts[i];
		    p = i;
		    }
		  
		}
		
		  System.out.println(keywords[p]);
		
		
		
	}
}

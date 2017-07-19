import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
	
		for(int t =0;t<T;t++)
		{   String str = in.next();
		    char chararray[] = new char[str.length()];
		    float max = Float.MIN_VALUE;
		    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		    ArrayList<Character> al = new ArrayList<Character>();
		    chararray = str.toCharArray();
		    
		    for(int j=0;j<str.length();j++)
		    {   al.add(chararray[j]);
		        int counter = 1;
		        for(int k=j+1;k<str.length();k++)
		        {  
		            if(al.contains(chararray[k])== true)
		            {
		                
		                 continue ;
		                
		            }
		            else
		            {    if(hm.containsKey(k-j))
		                {
		                if(hm.get(k-j) < counter+1)
		                    {
		                       hm.put(k-j,++counter);
		                    }
		                }
		                else 
		                  hm.put(k-j,++counter);
		                 
		            }
		            
		            
		            
		        }
		        al.clear();
		    }
		    
		    for(Map.Entry <Integer,Integer> item: hm.entrySet())
		    {
		        if(item.getKey()/item.getValue()>max)
		        max = item.getKey()/item.getValue();
		    }
		    for(Map.Entry <Integer,Integer> item: hm.entrySet())
		    {
		        if(item.getKey()/item.getValue() == max){
		       System.out.println(item.getKey()+"");
		        break;
		        }
		    }
		    
		    
		}
		
		
		
		
		
		
		
	}
}
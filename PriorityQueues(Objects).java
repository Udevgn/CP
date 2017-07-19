/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class Nodes implements Comparable<Nodes>
    {
        int node;
        int priority;
        public int compareTo(Nodes n)
        {
            if(this.priority > n.priority)
             return -1;
       else 
            if(this.priority < n.priority)
             {
                 return 1;
             }
             else 
             return 0;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		
	
		Nodes nodes[] = new Nodes[10];
		for(int i=0;i<10;i++)
		{nodes[i] = new Nodes();
		    nodes[i].node = i;
		    nodes[i].priority = 10-i-1;
		}
	    
		PriorityQueue<Nodes> pq = new PriorityQueue<Nodes>();
	    
		for(int i=0;i<10;i++)
		{
		    pq.add(nodes[i]);
		}
		
		for(int i=0;i<10;i++){
		    Nodes n = pq.poll();
		    System.out.println(n.node+" "+n.priority);
		}
		
	}
	
}

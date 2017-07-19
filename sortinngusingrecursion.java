/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
   static Stack<Integer> st = new Stack<Integer>();
    public static void sort(Stack<Integer> stack,int x)
    {
        
        
        if(stack.empty())
        {
            stack.push(x);
            return;
        }
         
        if(x<stack.peek())
        {
            int a = stack.pop();
            sort(stack,x);
            stack.push(a);
        }
       else
       stack.push(x);
         
        
    }
    public static void recursive(Stack<Integer> stack)
    {
        if(stack.empty() == false)
        {
            int temp = stack.pop();
            recursive(stack);
            sort(stack,temp);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	
	 
	 st.push(8);
	 st.push(5);
	 st.push(2);
	 st.push(6);
	 st.push(2);
	 st.push(1);
	 recursive(st);
	 System.out.println(st+"");
	}
}

import java.util.*;

public class Solution 
{
	public static void main(String args[])
	{
		 String []s = new String[]{"4", "13", "5", "/", "+"};
		 Solution ss = new Solution();
		 System.out.println(ss.evalRPN(s));
	}
	
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> s = new Stack<Integer>();
        int num,a,b;
        for(int i=0;i<tokens.length;i++)
        {
        	try
        	{
        		num = Integer.parseInt(tokens[i]);
        		s.push(num);
        	}
        	catch(NumberFormatException e)
        	{
        		b = s.pop();
        		a = s.pop();
        		if(tokens[i].equals("+"))
        			s.push(a+b);
        		else if(tokens[i].equals("-"))
        			s.push(a-b);
        		else if(tokens[i].equals("*"))
        			s.push(a*b);
        		else if(tokens[i].equals("/"))
        			s.push(a/b);
        		
        	}
        }
        return s.pop();
    }
}
package com.dit.dsa.mix;

import java.util.Stack;

public class DuplicateParenthesis {
	
	public static boolean checkDuplicateParenthesis(String string)
	{
		Stack<Character> stack = new Stack<>();
		
		char str[] = string.toCharArray();
		
		for(char ch : str) // ch = ')'
		{
			if(ch == ')') 
			{
				char top = stack.peek(); // top = '('
				stack.pop();
				
				int counter = 0;
				while(top != '(')
				{
					counter++; // 1, 2, 3
					top = stack.peek(); // +, a, (
					stack.pop();
				}
				
				if(counter < 1) // 3 < 1, 0 < 1
				{
					return true;
				}
			}
			else {
				stack.push(ch);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "(((a + b)) + (c * d))))";
		
		if(checkDuplicateParenthesis(str))
		{
			System.out.println("Duplicate Parenthesis Found");
		}
		else {
			System.out.println("Duplicate Parenthesis Not Found");
		}

	}

}

package com.dit.dsa.mix;

import java.util.Stack;

public class PostfixToPrefix {
	
	public static boolean checkOperator(char ch)
	{
		switch(ch)
		{
		case '+':
		case '-':
		case '/':
		case '*':
			return true;
		}
		
		return false;
	}
	
	public static String getPrefix(String postfixExp)
	{
		Stack<String> stack = new Stack<>();

		int length = postfixExp.length();
		
		for(int i = 0; i < length; i++)
		{
			//if the symbol is operator
			if(checkOperator(postfixExp.charAt(i))) {
				String operand1 = stack.peek();
				stack.pop();
				String operand2 = stack.peek();
				stack.pop();
				
				String result = postfixExp.charAt(i) + operand2 + operand1;
				
				stack.push(result);
			}
			else { // if symbol is an operand
				stack.push(postfixExp.charAt(i) + "");
			}
		}
		
		String finalResult = "";
		for(String i : stack)
		{
			finalResult += i;
		}
		
		return finalResult;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exp = "ABC/-AK/L-*"; // *-A/BC-/AKL
		
		System.out.println(getPrefix(exp));

	}

}

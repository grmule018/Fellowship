package com.bridglabz.datastructures2;

import com.bridglabz.utility.*;

public class BalancedParanthesis 
{
	public static <T> void main(String[] args) 
	{
		StackUtility <T> stack = new  StackUtility<T>();
		System.out.println("Enter The Expression");
		String expression = new String();
		expression = Utility.StringInput();
		int top = 0;
		
		char expressionArray[] = expression.toCharArray();
		
		for(int i = 0; i<expressionArray.length; i++)
		{
			if(expressionArray[i]=='(')
			{
				top++;
				stack.push(expressionArray[i]);
			}
			
			else if(expressionArray[i]==')')
			{
				if(top==0)
				{
					top=-1;
					break;
				}
				stack.pop();
			}
		}
		
		if(!(stack.isEmpty())&&(top==0))
		{
			System.out.println("Expression has balanced paranthesis");
		}
		else
		{
			System.out.println("Expression has not balanced paranthesis");
		}
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {

		return super.toString();
	}
}
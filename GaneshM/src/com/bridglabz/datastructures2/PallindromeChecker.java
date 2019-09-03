package com.bridglabz.datastructures2;

import com.bridglabz.utility.DequeUtility;
import com.bridglabz.utility.Utility;

public class PallindromeChecker 
{

	public static <T> void main(String[] args) 
	{
		DequeUtility <T> pallindromeCheck = new DequeUtility<T>();
		System.out.println("Enter The String to check");
		String inputString = Utility.StringInput();
		for(int i = 0;i<inputString.length();i++)
		{
			pallindromeCheck.addFront(inputString.charAt(i));
		}
		
		pallindromeCheck.viewDequeByFront();
		int flag = 0;
		while(pallindromeCheck.size>1)
		{
			Object char1 = pallindromeCheck.removeFront();
			Object char2 = pallindromeCheck.removeRear();
			
			if(char1!=char2)
			{
				flag = 1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("String is Pallindrome");
		}
		else
		{
			System.out.println("String is not Pallindrome");
		}
	}

}
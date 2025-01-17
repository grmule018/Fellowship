/******************************************************************************
 *  Compilation:  javac -d bin PermutationString.java
 *  Execution:    java -cp bin com.bridgelabz.functional.PermutationString 
 *  
 *  Purpose: Check if the arrays returned by two string functions i.e iterative
 *  		 function and recursive function which gives the permutation of a 
 *  		 given string are equal.
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4-10-2019
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.ArrayList;
import java.util.List;
import com.bridgelabz.utility.FunctionalUtility;

public class PermutationString {
	
	/*
	* The main function is written to take input from the user and
	* call permute function that compares the permutation resulted 
	* by two methods
	*/
	public static void main(String[] args) {
		System.out.println("enter a string");
		String str =FunctionalUtility.userString();
		int len = str.length();
		int fact=1;
		for(int i=len;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Possible combinations are :"+fact);
		List<String> arr = new ArrayList<String>();
		System.out.println("recursion of a string is ");
		
		//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
		List<String> arr1=FunctionalUtility.recursion(str, 0, len,arr);
		System.out.println(arr1);
		System.out.println("recursion size is: "+arr1.size());
		System.out.println("array after sorting :");
		arr1=FunctionalUtility.listSort(arr1);
		System.out.println(arr1);
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("iteration of a string is ");
		
		//Method 2- using static function of FunctionalUtilty class of com.bridgelabz.util package
		List<String> arr2=FunctionalUtility.iteration(str);
		
		System.out.println(arr2);
		System.out.println("iteration size is: "+arr2.size());
		System.out.println("array after sorting :");
		arr2=FunctionalUtility.listSort(arr2);
		System.out.println(arr2);
		System.out.println();
		int flag=1;
		for(int i=0;i<arr1.size();i++)
		{
			if(arr1.get(i).compareTo(arr2.get(i))==0)
			{
				flag=1;
			}
			else
				flag=0;
		}
		if(flag==1)
		{
		System.out.println("arrays returned by two string functions are equal");
		}
		else
		System.out.println("arre not same");
	}
}

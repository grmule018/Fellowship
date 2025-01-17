/******************************************************************************
 *  Compilation:  javac -d bin SwapNibble.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.SwapNibble
 *  
 *  Purpose: To read an integer as an Input, convert to Binary using toBinary
 *  		 function and perform the following functions:
 * 			 	i. Swap nibbles and find the new number.
 *  			ii. Find the resultant number is the number is a power of 2
 *
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4/10/2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;

public class SwapNibble {
	
	/*
	* The main function is written to take input from the user and
	* calls swapNibble function to find the result after swapping
	* nibbles
	*/
	public static void main(String[] args) {
		System.out.println("Enter the integer");
		int flag=0;
		
		//Reading input from the user
		int num=AlgorithmUtility.userInt();
		
		//Method 1- using static function of AlgorithmUtility class of
	
		int swap=AlgorithmUtility.swapNibble(num);
				
		//Method 2- using static function of AlgorithmUtility class of
		
		int[] bin=AlgorithmUtility.toBinary(swap);
		
		for(int i=7;i>=0;i--)
			System.out.print(bin[i]);
			for(int i=0;i<swap;i++){
				Math.pow(2, i);
				flag=1;
			}
			if(flag==1)
				System.out.println("The number is the power of 2");
			else
				System.out.println("The number is not the power of 2");
			}
}

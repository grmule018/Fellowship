/******************************************************************************
 *  Compilation:  javac -d bin InsertionSort.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.InsertionSort
 *  
 *  Purpose: Finds the day of the week for the given date.
 *
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4/10/2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;

public class InsertionSort {
	
	/*
	* The main function is written to take input from the user and calls 
	* the function insertionSort that sorts the array
	*/
	public static void main(String[] args) {
		System.out.println("Enter the number of strings to be inserted");
		
		//Reading inputs from the user
		int num=AlgorithmUtility.userInt();
		String[] str_array=new String[num];
		for(int i=0;i<num;i++) {
			str_array[i]=AlgorithmUtility.userString();
		}
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		String[] res_array=AlgorithmUtility.insertionSort(str_array,num);
		
		System.out.println("The sorted array are:");
		for(int i=0;i<res_array.length;i++) {
			System.out.println(res_array[i]);
		}
	}
}

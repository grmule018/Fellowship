/*******************************************************************
 * Purpose: To find prime factorization given no 
 * @author Ganesh Mule
 * @version 1.0
 * @since  
 *****************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Prime_no_Factorization_6 {
private static void primenumberfactorization(long number){
	for(int i=2;i*i<=Long.MAX_VALUE;i++) {
		while (number%i==0) {
		System.out.println(i + " ");
			number =number/i;
		//	System.out.println(number);
		}
	}
	if (number>2) {
			System.out.println("givan number less than 2");
	}	
	
}
	public static void main(String[] args) {
		long number;
		System.out.println("Enter the Number= ");
		number = Utility.longInput();
	primenumberfactorization(number);
	//Utility.Prime_no_Factorization(number);
	}
}   

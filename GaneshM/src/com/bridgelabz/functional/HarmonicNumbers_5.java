/*******************************************************************************
 * Purpose: To find sum of harmonic numbers
 * @author Ganesh Mule
 * @version 1.0
 * @since 03-08-2019
 *******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class HarmonicNumbers_5 {

private static void harmonicNumber(int n) {
	
	double sum=0.0;
		for (int i=2;i<=n;i++) {
			sum=sum+(1.0/i);
			System.out.println(sum);
		}
}

	public static void main(String[] args) {
		//command line argument
		System.out.println("Enter number");
		int n = Utility.integerInput();
		harmonicNumber(n);
//Utility.HarmonicNumbers(n);
	}

}

/**
 * Coupon Numbers
 * Desc -> Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number? This program simulates this random process.
 * I/P -> N Distinct Coupon Number
 * Logic -> repeatedly choose a random number and check whether it's a new one.
 * O/P -> total random number needed to have all distinct numbers.
 * Functions => Write Class Static Functions to generate random number and to process distinct coupons.
 */

package com.grm.functional;

import com.grm.utility.Utility;


public class Coupon_8 {
	
	public static void main(String[] args)
	{
		System.out.println("");
		
		System.out.print("Enter The range 0 to ");
		int range = Utility.integerInput();
		
		System.out.print("Enter The find value :");
		int n = Utility.integerInput();
		
		Utility.Coupon_8(range,n);
	}
}
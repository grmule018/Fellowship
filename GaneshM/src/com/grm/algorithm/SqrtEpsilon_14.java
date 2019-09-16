/***********************************************
 * Purpose: To find square root using epsilon in newtons method
 * Write a static function sqrt  to compute the square root of a nonnegative 
 * number c given in the input using Newton's method:
 * initialize t = c
 * replace t with the average of c/t and t
 * repeat until desired accuracy reached 
 * using condition Math.abs(t - c/t) > epsilon*t where epsilon = 1e-15;

 * @author Ganesh Mule
 * @version 1.0
 * @since 03-08-2019 
 *****************************************/
package com.grm.algorithm;
import com.grm.utility.Utility;
public class SqrtEpsilon_14 {

	public static void main(String[] args) {
		double c = Double.parseDouble(args[0]);
		Utility.EpsilonSqrt(c);
		}
}

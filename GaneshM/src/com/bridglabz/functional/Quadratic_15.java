/******************************************************************************************
 *	Purpose = To find the roots of the equation a*x*x + b*x + c.
 *	Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
 *	can be found using a formula
 *	delta = b*b ­ 4*a*c
 *	Root 1 of x = (­b + sqrt(delta))/(2*a)
 *	Root 2 of x = (­b ­ sqrt(delta))/(2*a)
 * @author Ganesh Mule
 * @version 1.0
 * @since 01-08-2019
 *****************************************************************************************/
package com.bridglabz.functional;

import com.bridglabz.utility.Utility;

public class Quadratic_15 {
	public static void main(String[] args) {
	double a,b,c;
	
      System.out.print("enter the value of a= ");
      a=Utility.doubleInput();
      System.out.print("enter the value of b= ");
      b=Utility.doubleInput();
      System.out.print("enter the value of c= ");
      c=Utility.doubleInput();
      Utility.qudratic(a,b,c);
      
}


	}
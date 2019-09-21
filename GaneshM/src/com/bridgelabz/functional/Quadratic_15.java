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
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Quadratic_15 {
	private static void qudratic1(double a,double b,double c) {
		double delta=(b*b)-(4 *a*c);
		if (delta>0) {
			double root1=(-b+ Math.sqrt(delta)/2*a);
			double root2=(-b-Math.sqrt(delta)/2*a);
		System.out.println("Two destinct real root exists");
		System.out.println("root1"+root1);
		System.out.println("root2"+root2);
			}
		else if(delta==0) {
			double root1=-b/(2*a);
			double root2=-b/(2*a);
			System.out.println("Two equal real root");
			System.out.println("root1"+root1);
			System.out.println("root2"+root2);
		}
		else if(delta<0);
			double root1=-b/(2*a);
			double root2=-b/(2*a);
			double imaginary=Math.sqrt(-delta)/(2*a);
			System.out.println("Two destinct complex root exists");
			System.out.println("root1 "+root1+"+"+imaginary +"= "+(root1+imaginary));
			System.out.println("root2 "+root2+"-"+imaginary +"= "+(root2-imaginary));
		}
	
	public static void main(String[] args) {
		
	double a,b,c;
	  System.out.print("enter the value of a= ");
      a=Utility.doubleInput();
      System.out.print("enter the value of b= "); 
      b=Utility.doubleInput();
      System.out.print("enter the value of c= ");
      c=Utility.doubleInput();
      qudratic1(a,b,c);
      //Utility.qudratic(a,b,c);
    }
}

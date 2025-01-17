/**
 * Purpose : Regular Expression
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 03-09-2019
 **/
package com.bridgelabz.oops;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

	
public class Regex2
{	
	//Main function for regular expressions
	
	public static void main(String[] args) 
		{
		//regex string
		String str = "Hello <<name>>, We have your full name as <<full name>> in our system.\n"
					+ "Your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clearification"
					+ "Thank you BridgeLabz \n"
					+ "12/12/2019";
		Scanner sc=new Scanner(System.in);		
		
		System.out.println("Enter your first name");
		String fName = sc.next();
		System.out.println("Enter your last name");
		String lName =sc.next();

		String fullname = fName + " " + lName;

		//Pattern p = Pattern.compile("[a-zA-Z]+");

		if (Pattern.matches("[a-zA-Z]+", fName))
		{
			str = str.replaceAll("<<name>>", fName);
			str = str.replaceAll("<<full name>>", fullname);
		}
		//taking user input for mobile number
		System.out.println("Enter 10 digit mobile number");
		String MbNo = sc.next();
		
		if (Pattern.matches("[6789][0-9]{9}", MbNo))
		{
			str = str.replaceAll("x{10}", MbNo);
		}
		//taking current date 
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedString = localDate.format(formatter);
		str = str.replaceAll("12/12/2019", formattedString);
		System.out.println(str);
		sc.close();
	}
}

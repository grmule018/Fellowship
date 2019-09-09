/**
 * Purpose: Json  simple employee 
 *  
 * @author Ganesh Mule
 * @version 1.0
 * @since 09-09-2019
 **/
package com.bridglabz.oops;
import com.bridglabz.oops.JsonEmp;
import com.bridglabz.utility.jsonUtility;

public class JsonEmpTest 
{

	public static void main(String[] args) 
	{
		JsonEmp emp = new JsonEmp();
		emp.setEmpNumber(420);
		emp.setName(" Amar ");
		emp.setSalary(50000);
		String JSONEmp = jsonUtility.convertJavaToJson(emp);
		System.out.println(JSONEmp);

	System.out.println("=============+++++++++++++++=============");
	
		
	JsonEmp emp1=jsonUtility.convertJsonToJava(JSONEmp,JsonEmp.class);
	System.out.println(emp1.getEmpNumber() + emp1.getName() + emp1.getSalary());
} 
}
	
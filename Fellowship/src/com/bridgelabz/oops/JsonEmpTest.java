/**
 * Purpose: Json  simple employee 
 *  
 * @author Ganesh Mule
 * @version 1.0
 * @since 09-09-2019
 **/
package com.bridgelabz.oops;
import com.bridgelabz.oops.JsonEmp;
import com.bridgelabz.utility.JsonUtility;

public class JsonEmpTest 
{

	public static void main(String[] args) 
	{
		JsonEmp emp = new JsonEmp();
		emp.setEmpNumber(420);
		emp.setName(" Amar ");
		emp.setSalary(50000);
		String JSONEmp = JsonUtility.convertJavaToJson(emp);
		System.out.println(JSONEmp);

	System.out.println("=============+++++++++++++++=============");
	
		
	JsonEmp emp1=JsonUtility.convertJsonToJava(JSONEmp,JsonEmp.class);
	System.out.println(emp1.getEmpNumber() + emp1.getName() + emp1.getSalary());
} 
}
	
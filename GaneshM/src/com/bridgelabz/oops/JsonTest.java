
package com.bridgelabz.oops;
import com.bridgelabz.oops.JsonEmp;
import com.bridgelabz.utility.jsonUtility;

public class JsonTest 
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
	
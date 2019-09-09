package com.bridglabz.oops;


import java.io.Serializable;

public class JsonEmp implements Serializable
{
	private int empNumber;
	private String name;
	private double salary;
	
	public int getEmpNumber() 
	{
		return empNumber;
	}
	
	public void setEmpNumber(int empNumber) 
	{
		this.empNumber = empNumber;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public double getSalary() 
	{
		return salary;
	}
	
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
	
}
	


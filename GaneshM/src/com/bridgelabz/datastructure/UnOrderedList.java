/**
 * Purpose: Unordered list
 * 
 * @author Ganesh Mule
 * @version 1.0
 * @since 03-09-2019
 **/
package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.utility.*;

public class UnOrderedList 
{

	public static <T> void main(String args[]) throws IOException 
	{
		System.out.println("Reading file data.");
		try(
				BufferedReader bufferedReader = new BufferedReader(new FileReader
				("/home/user/Downloads/RELEASE/GaneshM/src/com/grm/datastructure/Read.txt")))
			{
			
			String line = bufferedReader.readLine();
			
			LinkedListUnorderd<T> LinkedList = new LinkedListUnorderd<T>();
			String array[] = line.split(" ");
			for(int i=0; i<array.length; i++)
			{
				LinkedList.addAtEnd(array[i]);
			}
			LinkedList.display();
			{
			// Searching for the string if present or not.
			System.out.println("Enter an input to search for a text.");
		
			String searchString = Utility.StringInput();
			boolean isStringPresent = LinkedList.search(searchString);
			if(isStringPresent)
			{
				System.out.println("Sring is found & deleted .");
				LinkedList.display();
				LinkedList.remove(searchString);
				LinkedList.display();
				LinkedList.writeDataToFile();
			}
			else
			{ 	
				
				System.out.println("string is not found & added");
				
				LinkedList.addAtEnd(searchString);
				//LinkedList.display();
				LinkedList.writeDataToFile();
				//LinkedList.remove(searchString);
				LinkedList.display();
			}
		}
	}	
			
		catch
		(Exception e) 
		{
			System.out.println(e);
		}
	}
}    


package com.bridglabz.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.bridglabz.utility.*;;

public class UnOrderedList 
{

	public static <T> void main(String args[]) throws IOException 
	{
		System.out.println("Reading file data.");
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader
				("/home/user/Downloads/RELEASE/GaneshM/src/com/bridglabz/datastructure/Read.txt"))) 
		{
			String stringWithFileData = "";
			String line = bufferedReader.readLine();
			while(line != null)
			{
				stringWithFileData+=line+" ";
				line = bufferedReader.readLine();
			}
			
			// Data receieved & storing it into sring array.
			String[] array = stringWithFileData.trim().split("\\s+"); 
			LinkedList<T> LinkedList = new LinkedList<T>();
			for(int i=0; i<array.length; i++)
			{
				LinkedList.addd(array[i]);
				
			
			// Searching for the string if present or not.
			System.out.println("Enter an input to search for a text.");
		
			String searchString = Utility.StringInput();
			boolean isStringPresent = LinkedList.search(searchString);
			if(isStringPresent)
			{
				System.out.println("Sring is found & deleted .");
				LinkedList.remove(searchString);
				LinkedList.display();
				LinkedList.writeDataToFile();
			}
			else
			{
				System.out.println("string is not found & added");
				LinkedList.addd(searchString);
				LinkedList.display();
				LinkedList.writeDataToFile();
				LinkedList.remove(searchString);
				LinkedList.display();
			}
		}
	}	
			
		catch
		(Exception e) 
		{
			System.out.println(e);
		}
	
		 
//		LinkedList<T> linkedList = new LinkedList<T>();
//		LinkedList.append("");
//		LinkedList.insertAtStart("");
//		LinkedList.insertAtStart("");
//		LinkedList.append("");
//		LinkedList.append("bat");
//		
//		System.out.println("is bat present "+LinkedList.search(""));
//		LinkedList.printList();
//		LinkedList.remove("");
//		LinkedList.printList();
//		LinkedList.remove("");
//		LinkedList.printList();
//		LinkedList.remove("");
//		LinkedList.printList();
	}
}    

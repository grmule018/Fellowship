package com.bridglabz.datastructures1;
import java.io.BufferedReader;
import java.io.FileReader;

import com.bridglabz.utility.*;
public class Hashing {
	public static void main(String[] args) {
		
		LinkedListInt[] arr=new LinkedListInt[11];
//		System.out.println("Reading file data.");
//		try(BufferedReader bufferedReader = new BufferedReader(new FileReader
//				("/home/user/Downloads/RELEASE/GaneshM/src/com/bridglabz/datastructures2/Read.txt"))){
				
		  for (int i=0;i<arr.length;i++) {
		   LinkedListInt A =new LinkedListInt();
	       A.addAtBegin(i);
//	       A.addAtEnd(arr[i]);
//		   arr[i]=A.addAtBegin(10);        
//	       arr[i]=A;
//	       result= writeDataToFile();
		  }
		
		  System.out.println(arr[0]);
}
}




package com.bridglabz.datastructures2;

import com.bridglabz.utility.LinkedList_Data_W;

public class LinkedList_Dataword <T>
{
	public static <T>void main(String[] args) 
	{
		LinkedList_Data_W <T> list = new LinkedList_Data_W<T>();
		list.insertAtFirst("hii");
		list.insertAtFirst("hello");
		list.insertAtPos(2, "how");
		
//		list.displayNodes();
//		list.insertAtFirst(10)
		list.displayNodes();
//		

//		list.insertLast(20);
//		list.displayNodes();
		
		int count = list.countNodes();
		System.out.println("Count: "+count);
	}
}
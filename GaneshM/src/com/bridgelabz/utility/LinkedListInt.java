/**	
 * Purpose: Linked list for 
 *  
 * @author Ganesh Mule
 * @version 1.0
 * @since 05-09-2019
 **/
package com.bridgelabz.utility;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class LinkedListInt {
	public NodeInt head;
	public int size;
	
	//for display the list
	public void display() {
		System.out.println("Link list");
		NodeInt tempNode=head;
		while (tempNode!=null)
		{
			System.out.println(""+ tempNode.data);
			tempNode=tempNode.next;
		}
	}
	//adding element front
	public void addAtBegin(int data) {
		NodeInt n=new NodeInt(data);
		n.data=data;
		if(head ==null)
		{ 
			head=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
		size++;
	}
	//adding element at end
	public void addAtEnd(int data) {
		NodeInt n=new NodeInt(data);
		NodeInt temp = head;
		while(temp.next!=null) {
		temp = temp.next;
		}
		temp.next=n;
		size++;
	}
	//adding element at position
	public void addAtPos(int data, int pos) {
		NodeInt n=new NodeInt(data);
		NodeInt temp=head;
		if(head==null)
		{
			addAtBegin(data);
		}
		else {
			int count=1;
			while(count<pos-1) {
				temp=temp.next;
				count++;
		}          
		n.next=temp.next;
		temp.next=n;
		size++;
		}
	}
	//deleting element at given position
	public void deleteAtPos(int pos){
		NodeInt temp= head;
		
		int count=1;
		while(count< pos-1) {
		temp= temp.next;
			count++;
		}
		NodeInt temp1=temp.next;
		temp.next=temp1.next;
		temp1=null;
		size--;
		}
	//deleting element at starting position	
	public void deleteAtBegin() {
		NodeInt temp = head;
		head = head.next;
		temp=null;
		size--;
		}
	//deleting element at end position
	public void deleteAtEnd() {
		NodeInt temp= head;
		while(temp.next==null) {
		temp= temp.next;
		}
		head = head.next;
		temp=null;
		size--;
	}
	//obtaining element at given position
	public int elementAt(int pos){
		
		if(pos>size){
			return -1;
		}
		NodeInt n = head;
		while(pos-1!=0){
			n=n.next;
		pos--;
		}
		return n.data;
		}
		
	//searching the position of given data
	public int search(int data){
		NodeInt n = head;
		int count = 1;
		while(n!=null){
		
			if(n.data==data)
			{
				return count;
			}
			else
			{
				n = n.next;
				count++;
			}
		}
			return -1;
		}

	public void writeDataToFile() throws IOException
	{
		FileWriter fileWriter = new FileWriter("/home/user/Downloads/RELEASE/GaneshM/src/com/grm/datastructure/Read.txt");
		try (PrintWriter printWriter = new PrintWriter(fileWriter)) 
		{
			String tmpString = "";
			NodeInt node = head;
			while(node != null)
			{
				tmpString = tmpString + node.data + " ";
				node = node.next;
			}
			tmpString = tmpString.trim();
			printWriter.write(tmpString);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	//checking elements present
	public boolean isEmpty()
	{
		return head == null;
	}
}
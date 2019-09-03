package com.bridglabz.datastructures1;

import com.bridglabz.utility.Node;

public class WorkO {
	Node head;
	public int size;
	
	public void add(int i) {
		size++;
		Node newNode=new Node();
		newNode.data= i;
		if (head==null)
		{ 
			head=newNode;
		}
		else {
			 Node tempNode= head;
			 while(tempNode.next !=null)
			 {
				 tempNode=tempNode.next;
			 }
			 tempNode.next =newNode;
		}
	}
	
	public void sort(){
		Node currNode=head;
		Node Index=null;
		
		int temp;
		
		if (head == null) {
			return;
		}
		else {
			while(currNode!=null) {
				Index=currNode.next;
			
				while(Index!=null) {
					if((int)currNode.data>(int) Index.data){
						temp=(int)currNode.data;
						currNode.data=Index.data;
						Index.data=temp;
					}
					Index=Index.next;
					
			}currNode=currNode.next;
			}
		
		}
	}
	public void display() {
		Node tempNode=head;
		while(tempNode !=null) {
			System.out.println(""+tempNode.data);
			tempNode=tempNode.next;
		}
		System.out.println(" ");
	}
	
}
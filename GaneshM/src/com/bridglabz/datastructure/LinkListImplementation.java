package com.bridglabz.datastructure;

public class LinkListImplementation {

	public static void main(String[] args) throws java.lang.Exception {
		//Object creating for linklist
		LinkedListT A = new LinkedListT();
		
		//Push into stack at begining
		A.addAtBegin(1);
		A.addAtBegin(2);
		
		//Push into stack at Eng
		A.addAtEnd(20);
		A.addAtEnd(31);
		
		//Delete node at begin
		A.deleteAtBegin();
		
		//Delete note at End
		A.deleteAtEnd();
		
		//Adding Node At index
		A.addAtIndex(10, 2);
		
		//Adding Node at End
		A.addAtEnd(15);
		
		//Display Data of Linklist
		A.display();
		
		// Print the size of stack
		System.out.println("\n Size of the list is: " + A.size);
		
		//Print the second postion of element
		System.out.println(" Element at 2nd position : " + A.elementAt(5));
		
		//Print search element
		System.out.println(" Searching element 20, location : " + A.search(15));
	}
}

// creating node
 class Node {
	public int data;
	public Node next;

	// Assign value to node
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

 // creating class for linklist
 class LinkedListT {
	 
	public Node head;
	public int size;
	public LinkedListT() {
		head = null;
	}
	//Method for ADD atg begin
	public void addAtBegin(int data) {
		//object create for Node
		Node n = new Node(data);
		n.next = head;
		head = n;
		size++;
	}
	
	//Method for Delete Node At Begin
	public int deleteAtBegin() {
		int tmp = head.data;
		head = head.next;
		size--;
		return tmp;
	}
	
	//Method for Delete At End
	public void deleteAtEnd() {
		Node currNode = head;
		if (head.next == null) {
			head = null;
		} else {
			while (currNode.next.next != null) {
				currNode = currNode.next;
			}
			int temp = currNode.next.data;
			currNode.next = null;
			size--;
		}
	}
	
	//Method for Add At End
	public void addAtEnd(int data) {
		if (head == null) {
			addAtBegin(data);
		} else {
			Node n = new Node(data);
			Node currNode = head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = n;
			size++;
		}
	}
	
	//Method for Element Positon
	public int elementAt(int index){
		if(index>size){
			return -1;
		}
		Node n = head;
		while(index-1!=0){
			n=n.next;
			index--;
		}
		return n.data;
	}
	
	// return size
	public int getSize(){
		return size;
	}
	
	// for searching the Node
	public int search(int data){
		Node n = head;
		int count = 1;
		while(n!=null){
			if(n.data==data){
				return count;
			}else{
				n = n.next;
				count++;
			}
		}
		return -1;
	}
	
	// Method at Add at Index position
	public void addAtIndex(int data, int position){
		if(position == 1){
			addAtBegin(data);
		}
		int len = size;
		if (position>len+1 || position <1){
			System.out.println("\nINVALID POSITION");
		}
		if(position==len+1){
			addAtEnd(data);
		}
		if(position<=len && position >1){
			Node n = new Node(data);
			Node currNode = head; //so index is already 1
			while((position-2)>0){
				System.out.println(currNode.data);
				currNode=currNode.next;
				position--;
			}
			n.next = currNode.next;
			currNode.next = n;
			size++;
		}
	}
	
	//Display the stack
	public void display() {
		System.out.println("");
		Node currNode = head;
		while (currNode != null) {
			System.out.print("->" + currNode.data);
			currNode = currNode.next;
		}
	}
}
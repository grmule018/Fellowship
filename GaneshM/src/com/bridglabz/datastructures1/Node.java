package com.bridglabz.datastructures1;

// creating node
public class Node<T> {

		public Object data;
		public Node<T> next;

		// Assigning value to node
		public Node(Object newdata) {
			data = newdata;
			next = null;
		}
		public Node(Object newData, Node<T> newNode)
		{
			data = newData;
			next = newNode;
		}
}
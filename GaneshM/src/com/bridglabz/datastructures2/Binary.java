/**
 * purpose: Binary tree.
 * @author Ganesh Mule
 * @version 1.0
 * @since 4-09-2019
 **/
package com.bridglabz.datastructures2;

class Node{
	int data;
	Node left;
	Node right;
}
class Binary{
	 
	public Node creatNewNode(int k) {
		Node n=new Node();
		n.data=k;
		n.left=null;
		n.right=null;
		return n;
	}


	public Node insert(Node root, int val){
		if (root==null) {
			return creatNewNode(val); 
		}
		if(val<root.data) {
			root.left=insert(root.left, val);
		}
		else if(val>root.data) {
			root.right=insert(root.right, val);
		}
		return root;
	}

	public static void main (String[]args) {

		Binary a = new Binary();
		
		Node root=null;
		 
		root =a.insert(root, 8);
		root =a.insert(root, 3);
		root =a.insert(root, 6);
		root =a.insert(root, 10);
		root =a.insert(root, 4);
		root =a.insert(root, 7);
		root =a.insert(root, 1);
		root =a.insert(root, 14);
		root =a.insert(root, 13);
	}
}

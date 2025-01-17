/**
 * Purpose : To provide 
 *  
 *  
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4/10/2019
 * 
 * 
 */
package com.bridgelabz.utility;

import java.util.Scanner;

import com.bridgelabz.datastructure.Node;

public class CustomLinkedList<T> {

	/**
	 * head of the type Node<T> is declared private to achieve encapsulation
	 */
	private Node<T> head;

	/**
	 * tail of the type Node<T> is declared private to achieve encapsulation
	 */
	private Node<T> tail;

	/**
	 * Constructos to initialize the instance variable head
	 */
	public CustomLinkedList() {
		head = null;
	}

	/**
	 * static object is created for Scanner class to avoid multiple object
	 * creations of the same class.
	 */
	static Scanner s = new Scanner(System.in);

	/**
	 * static function to read integers input from the user
	 * 
	 * @return integer values that are read
	 */
	public static int userInt() {
		return s.nextInt();
	}

	/**
	 * static function to read double input from the user
	 * 
	 * @return double values that are read
	 */
	public static double userDouble() {
		return s.nextDouble();
	}

	/**
	 * static function to read boolean input from the user
	 * 
	 * @return boolean values that are read
	 */
	public static boolean userBoolean() {
		return s.nextBoolean();
	}

	/**
	 * static function to read string input from the user
	 * 
	 * @return strings that are read
	 */
	public static String userString() {
		return s.next();
	}

	/**
	 * non-static function to check if the list is empty or not
	 * 
	 * @return true if list is empty else false
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * Function to add the elements to the linked list
	 * 
	 * @param data
	 *            the element that is to be added
	 */
	public void add(T data) {
		Node<T> n = new Node<T>();

		// Function call to set the data present in Node class
		// of com.bridgelabz.datastructure
		n.setData(data);

		System.out.println("Adding: " + data);
		if (isEmpty()) {
			head = n;
			tail = n;
		} else {

			// Function call to set the data present in Node class
			// of com.bridgelabz.datastructure
			tail.setNext(n);
			tail = n;
		}
	}

	/**
	 * Function to search the entered element in the list
	 * 
	 * @param data
	 *            the element that is to be searched
	 * @return true if present else false
	 */
	public boolean search(T data) {
		Node<T> temp = head;

		// Function call to get the link present in Node class
		// of com.bridgelabz.datastructure
		while (temp.getNext() != null) {

			// Function call to get the data present in Node class
			// of com.bridgelabz.datastructure
			if (data.equals(temp.getData())) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

	/**
	 * Function that gives the index of a specified element
	 * 
	 * @param data
	 *            the data whose index is to be found
	 * @return the index of the specified element
	 */
	public int index(T data) {
		Node<T> curr = head;
		int count = 0;
		while (curr != null) {
			if (curr.getData().equals(data)) {
				curr.getNext();
				return count;
			}
			count++;
			curr = curr.getNext();
		}
		assert (false);
		return 0;
	}

	/**
	 * Function to remove the element of the specified index
	 * 
	 * @param index
	 *            the index of an element which is needed to be deleted
	 */
	public void remove(int index) {
		if (isEmpty())
			return;
		Node<T> temp = head;
		if (index == 0) {
			head = temp.getNext();
			return;
		}
		for (int i = 0; temp != null && i < index - 1; i++) {
			temp = temp.getNext();
		}
		if (temp == null || temp.getNext() == null)
			return;
		Node<T> next = temp.getNext().getNext();

		temp.setNext(next);
	}
/**
 * Functions that returns the 
 */
    public void getLinkedList() {
        Node<T> tmp = head;
        while (true) {
            if (tmp == null) {
                break;
            }
            if(tmp.getData()!=null)
            {
            System.out.print(tmp.getData()+"\t\t\t\t");
            }
            tmp = tmp.getNext();
        }
    }
	
	/**
	 * Function that returns the size of the linked list
	 * 
	 * @return
	 */
	public int size() {
		Node<T> tnode = head;
		int len = 0;
		while (tnode != null) {
			len++;
			tnode = tnode.getNext();
		}
		return len;
	}

	/**
	 * Function that converts the list into String array
	 * 
	 * @param array
	 *            the array that is empty
	 * @return the array of strings
	 */
	public String[] convArray(String[] array) {
		Node<T> tnode = head;
		int i = 0;
		while (tnode != null) {
			array[i] = String.valueOf(tnode.getData());
			tnode = tnode.getNext();
			i++;
		}
		return array;
	}

	/**
	 * Function to convert the array of strings to array of integers
	 * 
	 * @param arr
	 *            the array of strings that is needed to be converted
	 * @return the array of integer
	 */
	public int[] convertIntArray(String[] arr) {
		int[] arrInt = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrInt[i] = Integer.valueOf(arr[i]);
		}
		return arrInt;
	}

	/**
	 * Function that sorts the given array in ascending order
	 * 
	 * @param array
	 *            the array of integers that is needed to be sorted
	 * @return array of integers that is sorted
	 */
	public int[] sort(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	/**
	 * Function that prints all the elements present in the linked list
	 */
	public void printList() {
		Node<T> tnode = head;
		while (tnode != null) {
			System.out.print(tnode.getData() + " ");
			tnode = tnode.getNext();
		}
	}
}
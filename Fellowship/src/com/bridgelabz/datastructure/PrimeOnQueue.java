/******************************************************************************
 *  Compilation:  javac -d bin PrimeOnQueue.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.PrimeOnQueue n
 *  
 *  Purpose: �> Add the Prime Numbers that are Anagram in the Range of 0 � 1000 
 *  			in a Queue using the Linked List and Print the Anagrams from 
 *  			the Queue.
 *  
 *  @author  Ganesh Mule
 *  @version 1.0
 *  @since   4/10/2019 
 ******************************************************************************/

package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.List;
import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.Queue;

public class PrimeOnQueue {
	
	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000 using queue
	*/
	public static void main(String[] args) {
		  	List<Integer> list = new ArrayList<Integer>();
		  	
		  	//Customized Queue
		  	Queue<Integer> queue=new Queue<Integer>();
		  	
		    //Method 1- using function of AlgorithmUtility class of
		
	        list = AlgorithmUtility.primeNumbers(0,1000);
	        
	        for(int i=0;i<list.size();i++){
				  for(int j=i+1;j<list.size();j++){
					  
					//Method 2- using function of AlgorithmUtility class of
		
					  if(AlgorithmUtility.isAnagram(String.valueOf(list.get(i)),String.valueOf( list.get(j)))){
						  
						//Method 3- using function of Queue class of
		
						  queue.insert(list.get(i));
						  queue.insert(list.get(j));
					}
				}
			}
	        System.out.println("Elements in a queue are :");
	        
	        //Method 4- using function of Queue class of
		
	        queue.display();
	}
}

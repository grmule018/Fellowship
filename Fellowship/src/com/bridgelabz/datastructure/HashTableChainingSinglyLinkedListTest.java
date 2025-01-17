/****************************************************************************************
 * Compilation:  javac -d bin HasTableChainigSinglyLinkedList.java
 * Execution:    java -cp bin com.bridgelabz.datastructure.HasTableChainigSinglyLinkedList.java
 * 
 * Purpose: To implement  HashMap
 * 
 *	@author  Ganesh Mule
 *  @version 1.0
 *  @since   4/10/2019
 **********************************************************************************/

package com.bridgelabz.datastructure;
/*
 *    Java Program to Implement Hash Tables chaining with Singly Linked Lists
 */
 
import java.util.Scanner;
 
/* Node for singly linked list */
class SLLNode
{
    SLLNode next;
    int data;
 
    /* Constructor */
    public SLLNode(int integer)
    {
        data = integer;
        next = null;
    }
}
 
/* Class HashTableChainingSinglyLinkedList */
class HashTableChainingSinglyLinkedList
{
    private SLLNode[] table;
    private int size ;
 
    /* Constructor */
public HashTableChainingSinglyLinkedList(int tableSize)
{
    table = new SLLNode[ nextPrime(tableSize) ];
    size = 0;
}
/* Function myhash */
private int myhash(Integer x )
{
    int hashVal = x.hashCode( );
    hashVal %= table.length;
    if (hashVal < 0)
        hashVal += table.length;
    return hashVal;
}
/* Function to generate next prime number >= n */
private static int nextPrime( int n )
    {
        if (n % 2 == 0)
            n++;
        for ( ; !isPrime( n ); n += 2);
 
        return n;
    }
    /* Function to check if given number is prime */
private static boolean isPrime( int n )
{
    if (n == 2 || n == 3)
        return true;
    if (n == 1 || n % 2 == 0)
        return false;
    for (int i = 3; i * i <= n; i += 2)
        if (n % i == 0)
            return false;
    return true;
}
/* Function to check if hash table is empty */
public boolean isEmpty()
{
    return size == 0;
}
/* Function to clear hash table */
public void makeEmpty()
{
    int l = table.length;
    table = new SLLNode[l];
    size = 0;
}
/* Function to get size */
public int getSize()
{
    return size;
}
/* Function to insert an element */
public void insert(int val)
{
    size++;
    int pos = myhash(val);        
    SLLNode nptr = new SLLNode(val);                
    if (table[pos] == null)
        table[pos] = nptr;            
    else
    {
        nptr.next = table[pos];
        table[pos] = nptr;
    }    
}
/* Function to remove an element */
public void remove(int val)
{
    int pos = myhash(val);    
    SLLNode start = table[pos];
    SLLNode end = start;
    if (start.data == val)
    {
        size--;
        table[pos] = start.next;
        return;
    }
    while (end.next != null && end.next.data != val)
        end = end.next;
    if (end.next == null)
    {
        System.out.println("\nElement not found\n");
        return;
    }
    size--;
    if (end.next.next == null)
    {
        end.next = null;
        return;
    }
    end.next = end.next.next;
    table[pos] = start;
}

public void printHashTable ()
	{
    	System.out.println();
    for (int i = 0; i < table.length; i++)
    {
        System.out.print ("Bucket " + i + ":  ");             
        SLLNode start = table[i];
	while(start != null)	
	{
		System.out.print(start.data +" ");
                start = start.next;
     }
            System.out.println();
        }
    }   
}
 
/* Class HashTableChainingSinglyLinkedListTest */
public class HashTableChainingSinglyLinkedListTest
{ 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hash Table Test\n");
        System.out.println("Enter size"); 
/* Make object of HashTableChainingSinglyLinkedList */
        HashTableChainingSinglyLinkedList htcsll = new HashTableChainingSinglyLinkedList(sc.nextInt() );
 
        char ch;
        /*  Perform HashTableChainingSinglyLinkedList operations  */
        do    
        {
			System.out.println("\nHash Table Operations\n");
			System.out.println("1.Insert\n2.Remove\n3.Clear\n4.Size\n5.Check empty ");
		
 
			int choice = sc.nextInt();            
			switch (choice)
			{
				case 1 : 
				    System.out.println("Enter integer element to insert");
				    htcsll.insert( sc.nextInt() ); 
				    break;                          
				case 2 :                 
				    System.out.println("Enter integer element to delete");
				    htcsll.remove( sc.nextInt() ); 
				    break;                        
				case 3 : 
				    htcsll.makeEmpty();
				    System.out.println("Hash Table Cleared\n");
				    break;
				case 4 : 
				    System.out.println("Size = "+ htcsll.getSize() );
				    break; 
				case 5 : 
				    System.out.println("Empty status = "+ htcsll.isEmpty() );
				    break;        
				default : 
				    System.out.println("Wrong Entry \n ");
				    break;   
				}
			/* Display hash table */ 
			            htcsll.printHashTable();  
			 
		    System.out.println("\nDo you want to continue (Type y or n) \n");
		    	ch = sc.next().charAt(0);                        
			} while (ch == 'Y'|| ch == 'y'); 
        	sc.close();
		}
	}
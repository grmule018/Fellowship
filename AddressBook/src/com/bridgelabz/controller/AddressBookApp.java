/******************************************************************************
   
 *  Purpose: The program is to maintain an address books
 *
 ******************************************************************************/

package com.bridgelabz.controller;

import com.bridgelabz.service.AddressBookManager;
import java.io.IOException;

import java.util.Scanner;

public class AddressBookApp {
	
	
	public static void main(String[] args) throws IOException {
		Scanner sc =new Scanner(System.in);
		AddressBookManager addBookMan = new AddressBookManager();
		do {
			System.out.println("Enter your choice");
			System.out.println(" 1:Create Book \n 2:Open Book \n 3:Save Book \n 4:Save As \n 5:Close Book \n 6:Quit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:

				addBookMan.createBook();
				
				break;
			case 2:
				
				addBookMan.openBook();
				
				break;
			case 3:
				
				addBookMan.saveBook();
				
				break;
			case 4:
				
				addBookMan.saveAsBook();
				
				break;
			case 5:
				
				addBookMan.close();
				
				break;
			case 6:
				System.out.println("Quit");
				addBookMan=null ;
				break;

			}
		}while(addBookMan != null);
		System.out.println("You have exited");
		sc.close();
	}
	
}

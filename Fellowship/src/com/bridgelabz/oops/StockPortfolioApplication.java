/**
 * Purpose: This application is to manage stocks
 *  
 * @author Ganesh Mule
 * @version 1.0
 * @since 09-09-2019
 **/
package com.bridgelabz.oops;

import java.io.IOException;
import java.util.Scanner;

// The main function is written to take input from the user and
// calls various methods that manages the stocks

public class StockPortfolioApplication {
	public static void main(String[] args) throws IOException {
		Scanner sc =new Scanner(System.in);
		int flag=0;
		do {
			System.out.println("Enter\n1:Add Stock\n2:Calculate each stock value\n3:Calculate value of total stocks\n4:Display");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
			
				StockPortfolio.addStock();
				
				break;
			case 2:
							
				StockPortfolio.valueOfEachShare();
				
				break;
			case 3:
					
				StockPortfolio.valueOfTotalStocks();
				
				break;
			case 4:
				
				StockPortfolio.displayStockDetails();
			
				break;
			
			default:
				System.out.println("Invalid choice");
				break;
			}
		}while(flag<1);
		sc.close();
	}
}

/******************************************************************************
 * Purpose: This application is to manage stocks
 ******************************************************************************/

package com.bridglabz.oops;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridglabz.utility.*;;

public class StockPortfolio {
	static List<Stock> listOfStock = new ArrayList<>();
	static final String stockFile = "/home/user/Downloads/RELEASE/GaneshM/src/com/bridglabz/oops/Stock.json";

	//Static function to add stock 
	public static void addStock() throws IOException {
		String string = OopsUtility.readJsonFile(stockFile);
		try {
			listOfStock = OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
		Stock stock = new Stock();
		System.out.println("Enter the stock name");
		stock.setStockName(Utility.StringInput());
		System.out.println("Enter the number of stock");
		stock.setNoOfShares(Utility.integerInput());
		System.out.println("Enter the price for per share");
		stock.setSharePrice(Utility.floatInput());
		listOfStock.add(stock);
		String json = OopsUtility.userWriteValueAsString(listOfStock);
		OopsUtility.writeFile(json, stockFile);
	}

	
	// Static function to calculate each value of stock
	 
	public static void valueOfEachShare() throws IOException {
		String string = OopsUtility.readJsonFile(stockFile);
		float valueOfEachShare;
		try {
			listOfStock = OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
			for (Stock stock : listOfStock) {
				System.out.println("Stock Name: " + stock.getStockName());
				valueOfEachShare = stock.getNoOfShares() * stock.getSharePrice();
				System.out.println("Value of each stock: " + valueOfEachShare);
				System.out.println("----------------------------------------");
			}
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
	}

	// Static function to calculate the value of total sales
	 
	 
	public static void valueOfTotalStocks() throws IOException {
		String string = OopsUtility.readJsonFile(stockFile);
		double totalStockValue = 0;
		try {
			listOfStock = OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
			for (Stock stock : listOfStock) {
				totalStockValue += (stock.getNoOfShares() * stock.getSharePrice());
			}
			System.out.println("Value of Total Stock: " + totalStockValue);
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
	}

	// Static function to display the stock details
		
	public static void displayStockDetails() throws IOException {
		String string = OopsUtility.readJsonFile(stockFile);
		try {
			listOfStock = OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
			for (Stock stock : listOfStock) {
				System.out.println("Stock Name: " + stock.getStockName());
				System.out.println("Number of Shares: " + stock.getNoOfShares());
				System.out.println("Share price :" + stock.getSharePrice());
				System.out.println("------------------------------------");
			}
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
	}

	 // Static function to calculate the number of stocks present 
		
	public static int noOfShares() throws IOException {
		String string = OopsUtility.readJsonFile(stockFile);
		int sum = 0;
		try {
			listOfStock = OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
			for (Stock stock : listOfStock) {
				sum += stock.getNoOfShares();
			}
			return sum;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return 0;
		}
	}
}

/******************************************************************************
 * Purpose: Creates a plain old java object to achieve encapsulation and for
 *  		 reuse ability of the code 
 ******************************************************************************/

package com.bridglabz.oops;

public class Stock {
	
	private String stockName;
	private int noOfShares;
	private float sharePrice;
	//Crating getter setter methods
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}
	public float getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(float sharePrice) {
		this.sharePrice = sharePrice;
	}
}

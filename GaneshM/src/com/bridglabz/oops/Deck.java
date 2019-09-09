/**
 * Purpose : Deck of cards for playing .
 */
package com.bridglabz.oops;

import java.util.Random;

public class Deck {

	public static void main(String[] args) {
		
		String[] suit = {"Club", "Diamond", "Heart", "Spade"};
		String[] rank = {"2", "3", "4", "5","6", "7", "8", "9","10", "Jack", "Queen", "King", "Ace"};
		
		String[] deck = new String[52];
		//making deck of cards
		int count = 0;
		for(int i=0; i<suit.length; i++)
		{
			for(int j=0; j<rank.length; j++)
			{
				deck[count] = suit[i]+" "+rank[j];
				count++;
			}			
		}
		
		for(String a: deck)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
		String[] shuffledDeck=shuffleTheCards(deck);
		
		for(String a: shuffledDeck)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
		//distributing cards
		
		int count1 = 0;
		for (int i = 1; i<=4; i++) 
		{
			System.out.print("\nPlayer "+i+" has recieved : ");
			for (int j = 0; j < 13; j++) 
			{
				System.out.print(shuffledDeck[count1]+" ");
				count1++;
			}
			System.out.println();
		}
	}
	
	//Shuffling of cards
	private static String[] shuffleTheCards(String[] deck) {
		Random random = new Random();
		for(int i=0; i<deck.length-1; i++)
		{
			int value = random.nextInt(deck.length);
			String temp = deck[i];
			deck[i] = deck[value];
			deck[value] = temp;
			}
		return deck;
	}
}
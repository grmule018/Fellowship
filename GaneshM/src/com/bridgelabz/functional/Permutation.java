package com.bridgelabz.functional;

import java.util.Scanner;

public class Permutation 
{
	
		private static void swap(char[] ch,int i,int j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		private static void permute(char[] ch, int CI)
		{
			
			if(CI==ch.length-1)
			{	
			System.out.println(String.valueOf(ch));
	      	}
	
		for(int i=CI;i<ch.length;i++)
		{
			swap(ch,CI,i);
			permute(ch,CI+1);
			swap(ch,CI,i);
		}
	}
   public static void main(String args[]) 
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the string: ");
	   String s=sc.nextLine();
	   System.out.println("Permutation is :");
	   permute(s.toCharArray(),0);
   }
}

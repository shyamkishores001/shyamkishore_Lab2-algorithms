package Denominations;

import java.util.Scanner;

public class Denominationsclass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Mergesortimplementation mergeSortImplementation = new Mergesortimplementation();
		NotescountImplementation notesCount = new NotescountImplementation();
		
		System.out.println("Enter the size of currency denominations");
		int size= sc.nextInt();
			
		int array[]=new int[size];
		System.out.println("Enter the currency denominations value");
		
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(array,0,array.length-1);
		notesCount.notescountImlementation(array, amount);
		
		
	}

}

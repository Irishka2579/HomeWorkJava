package com.syntaxHWClass10;

public class CreateGrocerieList2DArray {

	public static void main(String[] args) {
		/*
		Using 2D array create a grocery list.
		Inside you should have an array of veggies, fruits, dairy and sweets.
		Retrieve all values from that array using 2 different loops
		*/
String[][]groceries= {
				
				{"banana", "apple","mango"},//0
				
				{"potato","tomato"},//1
				
				{"milk","cheese","ayran","yogurt"},//2
				{"chocolate","candy"},//3
				
			                   };
       System.out.println("First loop:");
		for(String[]grocery:groceries) {
			
			for(String g:grocery) {
				
				System.out.println(g);
			}
		}
		System.out.println("\nSecond loop:");
		
	
		    for(int i=0; i<groceries.length;i++) {
			for(int j=0; j<groceries[i].length;j++) {
				String element=groceries[i][j];
				System.out.println(element+" ");
			}
		}
	}

}

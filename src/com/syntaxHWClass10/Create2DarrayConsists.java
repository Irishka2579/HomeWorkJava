package com.syntaxHWClass10;

public class Create2DarrayConsists {

	public static void main(String[] args) {
		/*
		/Create a 2D array in which first array will consist 
		 * of 4 names and second array will contain grades. 
		 * Then your program should print name of the students 
		 * that has A and B grade
		 */
		
		String[][]names= {
				{"John","Thomas","Jack","Robert"},
				{"A","B"},
				
		                  };
		System.out.println(names[0][0]+" and "+names[0][3]+" has grade "+names[1][1]);
		System.out.println(names[0][1]+ " and "+names[0][2]+" has grade "+names[1][0]);
		}

}

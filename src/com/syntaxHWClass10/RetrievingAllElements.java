package com.syntaxHWClass10;

public class RetrievingAllElements {

	public static void main(String[] args) {
		/*Create 2D array of cars : american, german, korean, italian.
         *Then retrieve all values from that array using 2 different loops
         */
               String[][]cars= {
            		   {"american","german","korean","italian"},
            		   {"Ford","BMW","Hyundai","Ferrari"},
               };
               
               System.out.println();
               //get all elements using regular FOR loop
               for(String[]car:cars) {
            	   for(String c:car) {
            		   System.out.println(c);}
            	   
            	   System.out.println();}
               
            		   //get all elements using enhance loop
            		   for(int i=0; i<cars.length;i++) {
            			   for(int j=0; j<cars[i].length;j++) {
            				   String element=cars[i][j];
            				   System.out.println(element+" ");
            			   }
            				   System.out.println();
            		   }
            	   }

	
               }
	


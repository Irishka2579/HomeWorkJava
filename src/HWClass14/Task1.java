package HWClass14;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		// TODO Create a String that will hold a sentence. 
		//Write a program to get a new String without any space

		String sen="I love travel";
		String newsen;
		newsen=sen.split(" ")[0]+sen.split(" ")[1]+sen.split(" ")[2];


		System.out.println(newsen);
		
				
		
	}}
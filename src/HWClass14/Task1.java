package HWClass14;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		// TODO Create a String that will hold a sentence. 
		//Write a program to get a new String without any space

		     String sen="Me: I love travel";
		//when you won't change the content of the string value
			System.out.println(sen.replace(" "," "));	
			System.out.println(sen.replaceAll(" ", ""));//without spaces
			System.out.println(sen);
			
			
			StringBuilder sen2=new StringBuilder("I love travel");
		//if you will change the content of the String variable use StringBuilder method	
			System.out.println(sen2.reverse());//easier way
            System.out.println(sen2);
	}}
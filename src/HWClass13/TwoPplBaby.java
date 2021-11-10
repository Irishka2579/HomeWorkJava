package HWClass13;

import java.util.Scanner;

public class TwoPplBaby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
        String momsname;
		String dadsname;
		String babysname;
	
	//	dadsname.length();
		//momsname.length();

		System.out.println("Mom's first name?");
		momsname=scan.next();
		
		System.out.println("Dad's first name?");
		dadsname=scan.next();
		
		System.out.println("Boy or Girl?");
		babysname=scan.next();
		
		String name=null;
		if(babysname.equalsIgnoreCase("girl")) {
			name=momsname.substring(0,2)+dadsname.substring(dadsname.length()-3);
		//System.out.println("Suggested baby name:"+momsname.charAt(0)+momsname.charAt(1)+dadsname.charAt(dadsname.length()+1),dadsname.length()+dadsname.charAt(dadsname.length()-1));
		if(babysname.equalsIgnoreCase("boy")) {
			name=dadsname.substring(0,3)+momsname.substring(momsname.length()-2);
		}
	System.out.println(name.toUpperCase());
	
}
		
		
	}}
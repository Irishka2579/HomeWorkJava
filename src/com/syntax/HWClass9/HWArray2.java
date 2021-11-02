package com.syntax.HWClass9;

public class HWArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Task 2");
		String [] animals= {"monkey","tiger","horse","lion","dog","cat"};
		for (String name:animals) {
			System.out.println(name);
		}
		System.out.println("-------another way------");
		
		String[]animal=new String[6];
		animal[0]="monkey";
		animal[1]="tiger";
		animal[2]="horse";
		animal[3]="lion";
		animal[4]="dog";
		animal[5]="cat";
		for (int i=0;i<=animal.length;i++) {
		System.out.println(animals[i]+" ");
			}
		}
		}
	



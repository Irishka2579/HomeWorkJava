package com.syntax.HWClass9;

class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Task 1");
String [] carBrand= {"Toyota","BMW","Jeep","Porsche","Tesla","Ferrari"};
for (String name:carBrand) {
	System.out.println(name);
}
System.out.println("------another way-------");

String[]cars=new String[6];
cars[0]="Toyota";
cars[1]="BMW";
cars[2]="Jeep";
cars[3]="Porsche";
cars[4]="Tesla";
cars[5]="Ferrari";
for (int i=0;i<=cars.length;i++) {
System.out.println(cars[i]+" ");
	}
System.out.println("Task 2");
String [] animals= {"monkey","tiger","horse","lion","dog","cat"};
for (String name:animals) {
	System.out.println(name);
}
}
}
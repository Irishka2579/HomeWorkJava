package HWClass11;

public class HWphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 phone iphone=new phone();
 iphone.color="Orange";
 iphone.year=2020;
 iphone.brand="Apple";
 iphone.top="Speed";
 iphone.best();
 
System.out.println("This phone brand is "+iphone.brand);
 
 
 
 System.out.println("This phone is the best in "+ iphone.top);
 
 phone android=new phone();
 android.color="Blue";
 android.year=2021;
 android.brand="Samsung";
 android.top="Pictures";
 android.best();
 System.out.println("This phone is the best in "+ android.top);
 
 
 phone nokia=new phone();
 nokia.color="Grey";
 nokia.year=2021;
 nokia.brand="Nokia";
 nokia.top="Quality of outcase";
 nokia.best();
 System.out.println("This phone is the best in "+ nokia.top);
 
 
 
	}

}

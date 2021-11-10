package HWClass14;

public class Task3 {

	public static void main(String[] args) {
		// TODO You have a String a=”Is it saturday? 
		//Is it raining? Do we have a Java Class today?” 
		//How would you find out how many sentences are in that String?

	
		String a="Is it Saturday? Is it raining? Do we have a Java Class today?";
	String[]str=a.split("[?]");
		System.out.println(str.length);
	}

}

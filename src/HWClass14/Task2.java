package HWClass14;

public class Task2 {

	public static void main(String[] args) {
		// TODO :
		//Create a String that should be combination of letters,
		//numbers and special characters. 
		//Find out how many alpha characters are there in the String.
		String str="SDFgjkkl!@#$678";
		System.out.println(str.replaceAll("[^a-zA-Z]","").length());
	}

}

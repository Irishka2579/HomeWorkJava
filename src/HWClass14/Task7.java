package HWClass14;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 = "First String";
		String st2 = "Second String";
		st1 = st1 + st2;
		st2 = st1.substring(st2.length()-1);
		st1 = st1.replaceAll(st2,"");
		System.out.println("String 1 is now " + st1);
		System.out.println("String 2 is now " + st2);


	}

}

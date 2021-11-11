package HWClass14;

public class Task6 {

	public static void main(String[] args) {
		// TODO How would you check if String is palindrome or not?
		
		String str="lool"; //length[4];
		boolean pal=true;
		for (int i=0; i<str.length()/2; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				pal=false;
			}
		}if(pal) {
			System.out.println(str+" is palindrome");
		}else {
			System.out.println(str+" is not palindrome");
		}

		String str2="aba";
		StringBuilder strB=new StringBuilder(str);
		strB.reverse();
		if (str2.equals(strB.toString()));{
			System.out.println(str2+" is palindrome");
	//	} else  {
			System.out.println(str2+" is not palindrome");
		}
		
	}

}

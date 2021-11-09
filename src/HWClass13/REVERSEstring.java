package HWClass13;

public class REVERSEstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day="Sunday";
		String reverse="";
		for(int i=day.length()-1;i>=0;i--) {
			reverse=reverse+day.substring(i,i+1);
		}System.out.println(reverse);
	}

}

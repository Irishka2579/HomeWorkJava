package HWClass13;

public class OtherwaytoReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Sunday"; 
String newStr="";
for(int i=str.length()-1; i>=0;i--) { //lenght=6
	newStr+=str.charAt(i);
	
}
System.out.println(newStr);
	}

}

//Sunday
//012345
//length=6
//char 5=length-1  
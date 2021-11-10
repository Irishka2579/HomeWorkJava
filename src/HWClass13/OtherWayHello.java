package HWClass13;

public class OtherWayHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="hello";
if(!str.isEmpty()) {
	if(str.length()%2!=0 && str.length()>=3 ) {
		System.out.println(str.charAt(str.length()/2));
	}
}

}
}
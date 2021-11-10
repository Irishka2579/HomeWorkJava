package HWClass13;

public class OtherwayOftwoppl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String dadsname="Daneil";
String momsname="Mary";
String babysname="boy";
if(babysname.equalsIgnoreCase("Boy")) {
	String firstPart=dadsname.substring(0,dadsname.length()/2);
	String secondPart=momsname.substring(momsname.length()/2);
	System.out.println(firstPart+secondPart);
}
	}

}


public class IfStringEmptyorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Spaceship";
if(!name.isEmpty()) {
if(! (name.length()%2==0) && (name.length()>=3)) {
	System.out.println("The middle Character of "+name+"="+name.charAt(name.length()/2));
}
	}else {
		System.out.println("The string is empty");
	}

}
}
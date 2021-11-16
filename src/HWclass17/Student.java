package HWclass17;

public class Student {
String name;
String address;

public Student() {
	
}
public Student(String name,String address) {
	this.name=name;
	this.address=address;
}
 void printAll() {
	 System.out.println(name+" "+address);
 }
}

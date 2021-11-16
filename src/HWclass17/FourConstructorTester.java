package HWclass17;

public class FourConstructorTester {

public static void main(String[] args){ 
/*TODO Write a java class that have 4 constructors
* with 4 different access levels
* of constructors(private,public,default,protected) 
* and create 4 objects of this class:
* 1 - inside same class
* 2 - from outside the class;
* 3 - from different class inside different package  and observe result.
*/

	FourConstructor m1=new FourConstructor();
	FourConstructor m2=new FourConstructor(15);
	FourConstructor m3=new FourConstructor();
	FourConstructor m4=new FourConstructor(15,0,"George",'M');

		
	
	
}

}

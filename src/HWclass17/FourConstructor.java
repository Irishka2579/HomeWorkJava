package HWclass17;

public class FourConstructor {
int num;
int num2;
String name;
char gender;
	FourConstructor(){
		System.out.println("default access");
	}
  public FourConstructor(int num) {
	 this.num=num;
	 
	System.out.println("public access");
}
	private FourConstructor(int num, int mu2) {
		this(num);
		this.num2=num2;
		System.out.println("private access");
	}
	protected FourConstructor(int num, int num2, String name,char gender) {
		this(num,num2);
		this.name=name;
		this.gender=gender;
		System.out.println("protected access");
	}
	public static void main(String[]args) {
		
	FourConstructor m1=new FourConstructor();
	FourConstructor m2=new FourConstructor(15);
	FourConstructor m3=new FourConstructor(15,0);
	FourConstructor m4=new FourConstructor(15,0,"George",'M');

		
		
	
	}
}

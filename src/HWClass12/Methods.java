package HWClass12;

public class Methods {

	int getMax(int num1, int num2) {

 
	if(num1>num2) {
		return(num1);
	}else {
		return(num2);
	} }
	 void Methodss (int num) {
	  
	if(num%2==0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}}
	 
	void dif(String country) {
		String Hello=null;
		switch(country) {
		case "Russia":
			Hello="Privet";
			break;
		case "Mexico":
			Hello="Ola";
		case "France":
			Hello="Salut";
			break;
			default:
			System.out.println("Invalid");
			break;
		}
		System.out.println(Hello);
	}
}

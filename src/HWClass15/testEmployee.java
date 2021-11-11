package HWClass15;

public class testEmployee {

	public static void main(String[] args) {
		/*
		 * Create a Class called Employee:
Create three  variables  empID , salary and set the CEO to “Sumair” 
Create two objects of the class Employee 
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
		 * 
		 */

		Employee asel=new Employee();
		asel.name="Asel";
		asel.empID=123;
		asel.salary=8000;
		asel.CEO="Sumair";
		asel.story();
		System.out.println("---------------------");
		Employee ashgar=new Employee();
		ashgar.name="Ashgar";
		ashgar.empID=789;
		ashgar.salary=10000;
		ashgar.CEO="Sumair";
		ashgar.story();
		
	
	}

}

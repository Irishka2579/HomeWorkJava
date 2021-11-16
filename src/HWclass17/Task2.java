package HWclass17;

public class Task2 {
	/*
	 * Write a java Class Students that have a constructor which takes students name
	 * and 3 subject grades. Inside your class also have a method to Calculate
	 * Average Grade. Test Student class for 5 different students with different
	 * marks. Your program should print an average mark of each students name.
	 */
	String name;
	int sub1;
	int sub2;
	int sub3;
	public Task2(String name, int sub1, int sub2, int sub3) {
		super();
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	public void printAvGrade() {
		System.out.println(name+" "+((sub1+sub2+sub3)/3));
	}
}




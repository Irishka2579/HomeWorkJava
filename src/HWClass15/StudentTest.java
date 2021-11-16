package HWClass15;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Student s1=new Student();
s1.studentName="Mary";
s1.studentID=23467;
s1.numberOfStudents ++;
s1.story();
System.out.println("-------------------");
Student s2=new Student();
s2.studentName="Michael";
s2.studentID=456780;
s2.numberOfStudents ++; 
s2.story();
System.out.println("--------------------");
Student s3=new Student();
s3.studentName="Molly";
s3.studentID=890234;
s3.numberOfStudents ++;
s3.story();
System.out.println("------------------");
System.out.println("Total number of students: "+s3.numberOfStudents);
	}

}

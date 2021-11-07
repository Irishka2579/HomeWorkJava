package HWClass12;

public class MethodReturn {

	void Prime(int num) {
		 
			boolean prime = true;
		    for (int i=0; i<=num;i++) {
		   
		      if (num % 2 == 0) {
		        prime = false;
		        break;
		      }

		      ++i;
		    }

		    if (!prime)
		      System.out.println(num + " is not  prime number.");
		    else
		      System.out.println(num + " is a prime number.");
		}
		
	void Score(int num) {
		char grade=0;
		if(num>90) {
		grade='A';
		
		}if(num>80 && num<=90) {
			grade='B';
	
		}if(num>70 && num<=80) {
			grade='C';
		}if(num>50 && num<=70) {
			grade='D';
			
		}if(num<=50&&num>=0) {
			grade='F';
		
		}System.out.println(grade);
	}
	
	}

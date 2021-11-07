package HWClass12;

public class MethodEmail {

	void createEmail( String name,String lastName,String etype) {
		String complete=name+lastName+"@"+etype+".com";
        System.out.println(complete.toLowerCase());
	
	}
}

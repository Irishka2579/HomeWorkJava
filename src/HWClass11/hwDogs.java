package HWClass11;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class hwDogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dogs dog1=new Dogs();
		dog1.breed="Husky";
		dog1.color="Black and White";
		dog1.size="Medium";
		dog1.age=3;
		dog1.specialty="blue eyes";
		System.out.println("This dog is special in "+dog1.specialty);
		dog1.funny();
		System.out.println("This dog breed"+dog1.breed+" and he has this parametres:");
		System.out.println(dog1.color+" "+dog1.size+" "+dog1.age);
		
		

		Dogs dog2=new Dogs();
		dog2.breed="Labrador";
		dog2.color="Beige";
		dog2.size="Medium";
		dog2.age=5;
		dog2.specialty="friendly with kids";
		System.out.println("This dog is special in "+dog2.specialty);
		dog2.funny();
		System.out.println("This dog breed"+dog2.breed+" and he has this parametres:");
		System.out.println(dog2.color+" "+dog2.size+" "+dog2.age);
		
		

		Dogs dog3=new Dogs();
		dog3.breed="Bulldog";
		dog3.color="Blac";
		dog3.size="Small";
		dog3.age=1;
		dog3.specialty="funny look";
		System.out.println("This dog is special in "+dog3.specialty);
		dog3.funny();
	System.out.println("This dog breed"+dog3.breed+" and he has this parametres:");
	System.out.println(dog3.color+" "+dog3.size+" "+dog3.age);
	}

}
import java.util.Scanner;
import java.util.Random;

class MyCharacter {
	public String name;
	public String role;
	public int strength;
	public int dexterity;
	public int intelligence;
	public int constitution;
	public int charisma;
	public MyCharacter(){
		name = "";
		role = "no role";
		strength = 5;
		dexterity = 5;
		intelligence = 5;
		constitution = 5;
		charisma = 5;
	}
	public MyCharacter(String Role){
		if (Role.equals("Wizard")||Role.equals("wizard")) {
			role = "Wizard";
		}
		else if (Role.equals("Warrior")||Role.equals("warrior")) {
			role = "Warrior";
		}
		else if (Role.equals("Rogue")||Role.equals("rogue")) {
			role = "Rogue";
		}
		else{
			role = "no role";
		}
	}
	public void myToString(){
		System.out.println("Your role is "+ role);
		System.out.println("Your strength trait is "+ strength);
		System.out.println("Your dexterity trait is "+ dexterity);
		System.out.println("Your intelligence trait is "+ intelligence);
		System.out.println("Your constitution trait is "+ constitution);
		System.out.println("Your charisma trait is "+ charisma);
	}
}

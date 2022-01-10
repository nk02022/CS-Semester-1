import pkg.*;
import java.util.Scanner;
import java.util.Random;

class character{
		public String name;
		public String role;
		public int strength = 5;
		public int dexterity = 2;
		public int intelligence = 10;
		public int constitution = 3;
		public int charisma = 5;
		/*String a = ("wizard");
		String b = ("Wizard");
		String c = ("Warrior");
		String d = ("warrior");
		String e = ("Rogue");
		String f = ("rogue");
		System.out.println("You are a Wizard");*/
		
}
class stats {
	public static void main() {
		character Nick = new character();
		System.out.println(Nick.strength);
		System.out.println(Nick.dexterity);
		System.out.println(Nick.intelligence);
		System.out.println(Nick.constitution);
		System.out.println(Nick.charisma);
	}
}
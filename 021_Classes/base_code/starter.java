import java.util.Scanner;
import java.util.Random;
class character{
		String name;
		String a = ("wizard");
		String b = ("Wizard");
		String c = ("Warrior");
		String d = ("warrior");
		String e = ("Rogue");
		String f = ("rogue");
		boolean wi = name.equals(a);
		boolean wiz = name.equals(b);
		boolean wa = name.equals(c);
		boolean war = name.equals(d);
		boolean ro = name.equals(e);
		boolean rog = name.equals(f);
}
class starter {
	public static void main(String args[]) {
		// Your code goes below here
		character characters = new character();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome! Please select a role. Your options are Wizard, Warrior, or Rogue.");
		String name = sc.nextLine();
		System.out.println(characters);
	}
}
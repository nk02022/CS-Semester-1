import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Select a role. Your options are Wizard, Warrior, or Rogue.");
		String name = sc.nextLine();
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
		
		if (wi||wiz||wa||war||ro||rog) {
		System.out.println("Congrats! You are a " + name);
		}
		else{
			System.out.println("You didn't choose a valid role! Re-run program.");
		}
		
		
	}
}

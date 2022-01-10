import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {

	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Select a role. Your options are Wizard, Warrior, or Rogue.");
		String name = sc.nextLine();
		MyCharacter Nick = new MyCharacter();
		MyCharacter Joe = new MyCharacter(name);
		System.out.println("Joe is a "+ Joe.role);
		System.out.println("Nick is a "+ Nick.role);
		
	}
}
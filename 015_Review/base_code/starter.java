import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome! What is your name?");
		String anoon = sc.nextLine();
		System.out.println("Choose a title.");
		String title = sc.nextLine();
		System.out.println("Welcome! Please select a role. Your options are Wizard, Warrior, or Rogue.");
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
		int total = 25;
		if (wi||wiz||wa||war||ro||rog) {
			System.out.println("You will now begin choosing powers. You will have a total of 25 points to spend. Your options are strength, dexterity, intelligence, constitution, and charisma.");
		System.out.println("You get a maximum of 10 points per power. Choose your strength level.");
		int strength = sc.nextInt();
		if (strength > 10 ||strength < 0) {
			System.out.println("That is not a valid option. Try again.");
			strength = sc.nextInt();
			if (strength > 10 ||strength < 0) {
				System.out.println("That is also not a valid option. You need to go back to Kindergarten and learn how to count. Rerun program.");
			}
		}
		total = total - strength;
		System.out.println("Choose your dexterity level.You have "+ total +" points left");
		int dexterity = sc.nextInt();
		if (dexterity > 10 ||dexterity < 0) {
			System.out.println("That is not a valid option. Try again.");
			dexterity = sc.nextInt();
			if (dexterity > 10 ||dexterity < 0) {
				System.out.println("That is also not a valid option. You need to go back to Kindergarten and learn how to count. Rerun program.");
			}
		}
		total = total - dexterity;
		System.out.println("Choose your intelligence level.You have "+ total +" points left");
		int intelligence = sc.nextInt();
		if (intelligence > 10 ||intelligence < 0 || strength + dexterity + intelligence > 25) {
			System.out.println("That is not a valid option. Try again.");
			intelligence = sc.nextInt();
			if (intelligence > 10 ||intelligence < 0) {
				System.out.println("That is also not a valid option. You need to go back to Kindergarten and learn how to count. Rerun program.");
			}
		}
		total = total - intelligence;
		System.out.println("Choose your constitution level.You have "+ total +" points left");
		int constitution = sc.nextInt();
		if (constitution > 10 ||constitution < 0 || strength + dexterity + intelligence + constitution > 25) {
			System.out.println("That is not a valid option. Try again.");
			constitution = sc.nextInt();
			if (constitution > 10 ||constitution < 0) {
				System.out.println("That is also not a valid option. You need to go back to Kindergarten and learn how to count. Rerun program.");
			}
		}
		total = total - constitution;
		System.out.println("Choose your charisma level. You have "+ total +" points left");
		int charisma = sc.nextInt();
		if (charisma > 10 ||charisma < 0 || strength + dexterity + intelligence + constitution + charisma > 25) {
			System.out.println("That is not a valid option. Try again.");
			charisma = sc.nextInt();
			if (charisma > 10 ||charisma < 0) {
				System.out.println("That is also not a valid option. You need to go back to Kindergarten and learn how to count. Rerun program.");
			}
		}
		System.out.println("Hello "+ anoon+" the "+ title +"! You are a "+ name +". You have "+ strength +" strength points, "+ dexterity +" dexterity points, "+ intelligence +" intelligence points, "+ constitution +" constitution points, and "+ charisma +" charisma points. Thank you!");
		}
		else {System.out.println("You didn't choose a valid role! Re-run program.");
		}
		
}
}
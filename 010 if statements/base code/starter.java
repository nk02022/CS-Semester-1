import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Remeber to click enter after each answer!");
		System.out.println("What is your favorite number?");
		String x = sc.nextLine();
		System.out.println("What day were you born? (Numbers only)");
		String y = sc.nextLine();
		if (x==y) {
			System.out.println("Congrats! The two numbers you imputed are the same.");
		}
		if (x!=y) {
			System.out.println("Whomp whomp, the two numbers were not the same.");
		}
	}
}

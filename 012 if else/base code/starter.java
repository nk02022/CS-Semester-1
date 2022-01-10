import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a random number between 1 and 1000");
		int x = sc.nextInt();
		Random rand1 = new Random ();
		int y = rand1.nextInt(1000);
		System.out.println(y);
		if (x==y){
			System.out.println("Congrats! The numbers are the same.");
		}
		else {
			System.out.println("The numbers were not the same sorry.");
		}
		
	}
}

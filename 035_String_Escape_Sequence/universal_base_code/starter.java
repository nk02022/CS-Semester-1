import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Name a pet peeve");
		String input = sc.nextLine();
		System.out.println("You said that your pet peeve was: \n\""+input+".\" Huh. Really? That's the stupidest thing I've ever heard.");
	}
}

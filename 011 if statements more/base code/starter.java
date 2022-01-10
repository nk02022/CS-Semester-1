import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Remember to click enter after each answer.");
		System.out.println("Do not put the same number twice");
		System.out.println("What is your favorite number?");
		int x = sc.nextInt();
		System.out.println("What day is your birthday(Numbers only)");
		int y = sc.nextInt();
		System.out.println("Choose a number between 1 and 10");
		int z = sc.nextInt();
		
		if ((x>y) && (x>z)) {
			System.out.println("Your favorite number is the largest!");
		}
		if ((y>x) && (y>z)){
			System.out.println("Your birthday is the largest!");
		}
		if ((z>x) && (z>y)){
			System.out.println("Your random number is the largest!");
		}
		if ((x<y) && (x<z)){
			System.out.println("Your favorite number is the smallest!");
		}
		if ((y<x) && (y<z)){
			System.out.println("Your birthday is the smallest!");
		}
		if ((z<x) && (z<y)){
			System.out.println("Your random number is the smallest!");
		}
	}
}

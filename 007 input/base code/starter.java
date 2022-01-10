import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Remeber to click enter after imputing answers.");
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your age?");
		int age = sc.nextInt();
		System.out.println("What is your birthday month?");
		int month = sc.nextInt();
		System.out.println("What is your birthday day?");
		int day = sc.nextInt();
		System.out.println("What is your birthday year?");
		int year = sc.nextInt();
		System.out.println("How much is a buck fifty?");
		double dollarfifty = sc.nextDouble();
		System.out.println("Thank you for entering your information, all of your money is being transferred to an offshore account! Goodbye.");
	}
}

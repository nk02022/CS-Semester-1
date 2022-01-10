import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a name.");
		String name = sc.nextLine();
		System.out.println("How many times do you want to see it?");
		int x = sc.nextInt();
		int count = 1;
		while(true){
			System.out.println(name);
			if (count == x){
				break;
			}
			count = count + 1;
		}
}
}

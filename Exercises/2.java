import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Imput a number");
		int x = sc.nextInt();
		System.out.println("Imput another number");
		int y = sc.nextInt();
		int z = x*y;
		if (z%3 == 0){
			System.out.println("After multiplying your two numbers together, they are divisible by three. When you divide them, the answer is "+ z/3 +".");
		}
		else{
			System.out.println("Your numbers when multiplied are not divisble by three.");
		}
	}
}

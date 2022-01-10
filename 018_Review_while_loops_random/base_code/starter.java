import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Random rand1 = new Random ();
		int y = rand1.nextInt(1000)+1;
		System.out.println("Input a number");
		int x = sc.nextInt();
		while(true){
		if (x == y){
		System.out.println("Congrats! You guessed it. The right number was "+ y +".");
		break;
		}
		if (x != y){
		System.out.println("Wrong. Try again.");
		x = sc.nextInt();
		}
		
		
		
	}
}
}
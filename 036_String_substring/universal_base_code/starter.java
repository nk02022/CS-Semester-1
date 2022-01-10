import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word");
		String inpt = sc.nextLine();
		for(int i = 0; i<inpt.length(); i++){
			System.out.println(inpt.substring(i, i+1));
		}
	}
}

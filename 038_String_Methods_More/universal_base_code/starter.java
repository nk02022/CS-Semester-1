import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your full name?");
		String s = sc.nextLine();
		int space = s.indexOf(" ");
		System.out.println(s.substring(space+1, s.length()));
	}
}

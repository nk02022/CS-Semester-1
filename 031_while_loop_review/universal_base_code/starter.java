import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int count = 0;
		while(count<100){
			System.out.println((int)(Math.random()*100));
			count = count + 1;
		}
	}
}

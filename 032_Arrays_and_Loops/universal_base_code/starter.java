import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int [] bob = new int [1000];
		int count = 0;
		while(count<bob.length){
			bob[count] = (int)(Math.random()*100);
			count ++;
		}
		int coount = 0;
		while(coount<bob.length){
			System.out.println(bob[coount]);
			coount ++;
		}
	}
}

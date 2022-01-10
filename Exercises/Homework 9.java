import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] a = new int[20];
		for(int i = 0; i<a.length; i++){
			a[i]=1+(int)(Math.random()*50);
		}
		for(int i = 0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		int[] b = new int[20];
		for(int i = 0; i<b.length; i++){
			b[i]= a[a.length-1-i];
		}
		System.out.println("\n\n\n");
		for(int i = 0; i<a.length; i++){
			System.out.print(b[i]+" ");
		}
	}
}

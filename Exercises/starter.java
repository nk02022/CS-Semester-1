import java.util.Scanner;
import java.util.Random;


class starter {
	public static void printDupes(int target, int[] a){
		int numDupes = 0;
		System.out.print("Duplicate indexes: ");
		for(int i = 0; i<a.length; i++){
			if(a[i]==target){
				System.out.print(i+" ");
				numDupes++;
			}
		}
		System.out.println("\nNumber of duplicates: "+numDupes);
	}
	public static void consecutive(int[] a){
		for(int i = 0; i<a.length-1; i++){
			if(a[i]==a[i+1]){
				System.out.println("Duplicate at indexes of "+i+" and "+(i+1)+".  The value is:"+a[i]);
			}
		}
	}
	public static void main(String args[]) {
		// Your code goes below here
		/*part 1*/
		int[] num = new int[20];
		for(int i = 0; i<num.length; i++){
			num[i]=(int)(Math.random()*10);
		}/*generates the random numbers*/
		printDupes((int)(Math.random()*10), num);
		consecutive(num);
	}
}

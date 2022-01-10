import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] a = new int[(int)(Math.random()*149)+51];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for(int i = 0; i<a.length; i++){
			a[i] = (int)(Math.random()*100)+1; 
		}
		for(int i: a){
			if(i<min){
				min = i;
			}
			if(i>max){
				max = i;
			}
			sum+=i;
		}
		float avg = sum/a.length;
		System.out.println("The maximum value is: "+max);
		System.out.println("The minimum value is: "+min);
		System.out.println("There are "+a.length+" terms");
		System.out.println("The average of all the values is: "+avg);
	}
}

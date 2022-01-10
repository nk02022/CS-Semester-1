import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] a = new int[100];
		for(int i = 0; i< a.length; i++){
			a[i] = (int)(Math.random()*100)+1;
		}
		toStringArray(a);
		System.out.println("The average is: "+getArrayAverage(a));
		System.out.println("The maximum is: "+getArrayMax(a));
		System.out.println("The minimum is: "+getArrayMin(a));
	}
	public static void toStringArray(int[] A){
		String s = new String("");
		for(int i: A){
			s=s+", "+i;
		}
		System.out.println(s);
	}
	public static int getArrayAverage(int[] A){
		int sum = 0;
		for(int bob: A){
			sum+=bob;
		}
		return sum/A.length;
	}
	public static int getArrayMax(int[] A){
		int max = Integer.MIN_VALUE;
		for(int bob: A){
			if(bob>max){
				max=bob;
			}
		}
		return max;
	}
	public static int getArrayMin(int[] A){
		int min = Integer.MAX_VALUE;
		for(int bob: A){
			if(bob<min){
				min = bob;
			}
		}
		return min;
	}
}

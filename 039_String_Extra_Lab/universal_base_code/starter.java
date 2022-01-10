import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a sentence");
		String s = sc.nextLine();
		int numWords = numWords(s);

		int[] spaceIndexes = spaceInd(s);
		for(int i = 1; i<numWords; i++){
			System.out.print(s.substring(spaceIndexes[i-1], spaceIndexes[i])+" ");
		}
		System.out.print("\n");
		for(int i = numWords-1; i>0; i--){
			System.out.print(s.substring(spaceIndexes[i+1], spaceIndexes[i])+" ");
		}
	}
	public static int numWords(String s){
		int n = 1;
		String t = s;
		while(t.indexOf(" ")!=-1){
			t = t.substring(t.indexOf(" "), t.length());
			n++;
		}
		return n;
	}
	public static int[] spaceInd(String s){
		int[] ret = new int[numWords(s)+1];
		ret[0] = 0;
		for(int n = 1; n<ret.length; n++){
			ret[n] = s.indexOf(" ", ret[n-1]);
			n++;
		}
		return ret;
	}
}

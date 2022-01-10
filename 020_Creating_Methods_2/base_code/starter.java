import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		pow(5,3);
	}
	public static int pow(int a, int b){
		int x = a;
		int y = b-1;
		int c = x;
		int d = 0;
		while(true){
			x=x*c;
		if(y==d){
			System.out.println(x);
			break;
		}
			x=x/c;
			d=d+1;
		}
		return x;
}
}

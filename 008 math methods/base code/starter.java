import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
		
		//int a = 13;
		//int a = 3;
		//int a = 37;
		int a = 2;
		//int b = 6;
		//int b = 8;
		//int b = 3;
		int b = 14;
		//int c = 11;
		//int c = 3;
		//int c = 35;
		int c = 3;
		//int d = 30;
		//int d = 7;
		//int d = 21;
		int d = 2;
		//int e = 7;
		int e = 6;
		int f = (-2);
		
		double maxone = Math.max (a-b*c,d%e*f);
		System.out.println (maxone);
		
		double sqrt = Math.sqrt (a*b+c%d);
		System.out.println (sqrt);
		
		double pow = Math.pow (a/b,c%d);
		System.out.println (pow);
		
		double powtwo = Math.pow (a,b%c);
		double sqrttwo = Math.sqrt (d*e);
		double maxtwo = Math.max (powtwo,sqrttwo);
		System.out.println(maxtwo);
	}
}

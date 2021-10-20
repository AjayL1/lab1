package lab1;
import java.util.Scanner;
public class Fibonacci {
		static int recursive(int n) {
			if(n==1) return 1;
			if(n==0) return 0;
			return recursive(n-1)+ recursive(n-2);
		}
		static int nonRecursive(int n) {
			int a=1,b=1,c;
			int count=2;
			while(count<n) {
				count++;
				c=a+b;
				a=b;
				b=c;
			}
			return b;
		}
		public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a number");
		int n=sc.nextInt();

		System.out.println(recursive(n));
		System.out.println(nonRecursive(n));
	}

			
		
	}









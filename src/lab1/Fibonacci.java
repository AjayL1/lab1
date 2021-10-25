package lab1;
import java.util.Scanner;//imports scanner object class property
public class Fibonacci {
		static int recursive(int n) {
			if(n==1) return 1;
			if(n==0) return 0;
			return recursive(n-1)+ recursive(n-2);
		}//method where we write the logic
		static int nonRecursive(int n) {
			int a=1,b=1,c;
			int count=2;
			//recursion is happening here
			while(count<n) {
				count++;
				c=a+b;
				a=b;
				b=c;
			}
			return b;
		}
		public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);//to read the user input
		System.out.print("enter a number");
		int n=sc.nextInt//to store the input in a variable

		System.out.println(recursive(n));
		System.out.println(nonRecursive(n));
	}

			
		
	}









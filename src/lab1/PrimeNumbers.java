package lab1;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("enter a range");
				Scanner sc=new Scanner(System.in);
				int x=sc.nextInt();
				for(int i=1;i<=x;i++) {
					if(i%2!=0)
						System.out.println(i+" is a primenumber");
				}
				}
			

	}



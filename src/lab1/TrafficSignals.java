package lab1;

import java.util.Scanner;

public class TrafficSignals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1-Red");
		System.out.println("2-Yellow");
		System.out.println("3-Green");
		System.out.println("please choose a colour");
		int num=sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Ready");
			break;
		case 3:
			System.out.println("Go");
			break;
		default:
			System.out.println("Please enter valid number");
		}
	}

}

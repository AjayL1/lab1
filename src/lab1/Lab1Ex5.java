package lab1;
import java.util.*;
public class Lab1Ex5 {

	 int s=0;
   public int calculateSum(int n)
   {
          for(int i=0;i<=n;i++)
          {
                 if(i%3==0||i%5==0)
                 {
                       s+=i;
                 }
          }
          return s;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    	 Lab1Ex5 p1 = new Lab1Ex5();
		           Scanner s = new Scanner(System.in);
		           int n=s.nextInt();
		           System.out.println(p1.calculateSum(n));
		    }
	}


package lab1;
import java.util.*;//to import scanner class property
public class Lab1Ex5 {

	 int s=0;
   public int calculateSum(int n)
   {
	   //loop to calculate the sum of the given input by the user
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
		    	 Lab1Ex5 p1 = new Lab1Ex5();
		           Scanner s = new Scanner(System.in);
		           int n=s.nextInt();
		           System.out.println(p1.calculateSum(n));
		    }
	}


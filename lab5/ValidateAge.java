package lab5;
import java.util.*;
class AgeException extends Exception{
	public	AgeException(String str) {//constructor
		System.out.println(str);
	}
}
public class ValidateAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  your age:");
		int age=sc.nextInt();
		try {
			if(age<15) {
				throw new AgeException("invallid age");
			}else {
					System.out.println("valid age");
			}
		}
		catch(AgeException a) {
			System.out.println(a);
		}

	}

}

package lab5;
import java.util.*;//imports the scanner class property
class AgeException extends Exception{
	public	AgeException(String str) {//constructor
		System.out.println(str);
	}
}
public class ValidateAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//to read the user input
		System.out.println("enter  your age:");
		int age=sc.nextInt();
		//check whether age is valid or not
		try {
			if(age<15) {
				throw new AgeException("invallid age");
			}else {
					System.out.println("valid age");
			}
		}
		catch(AgeException a) {
			System.out.println(a);//to print the output
		}

	}

}

package lab5;
import java.util.*;// imports scanner class property
class InvalidNameException extends Exception{
}
public class NameValidaton {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);// reads the input given by the user
		System.out.println("first name");
		String firstname=sc.next();// store the input given by the user
		System.out.println("last name");
		String lastname=sc.next();
		//to check the input given by the user
		try {
			if(firstname.isEmpty() || lastname.isEmpty()) {
				throw new InvalidNameException();
				
			}
		}catch(InvalidNameException v) {
			System.out.println("Firstname and lastName cannot be blank");
		}finally {
			System.out.println("your name is : "+ firstname +" "+ lastname);//to print the output
			
		}

	}

}

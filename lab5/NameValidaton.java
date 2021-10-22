package lab5;
import java.util.*;
class InvalidNameException extends Exception{
}
public class NameValidaton {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("first name");
		String firstname=sc.next();
		System.out.println("last name");
		String lastname=sc.next();
		try {
			if(firstname.isEmpty() || lastname.isEmpty()) {
				throw new InvalidNameException();
				
			}
		}catch(InvalidNameException v) {
			System.out.println("Firstname and lastName cannot be blank");
		}finally {
			System.out.println("your name is : "+ firstname +" "+ lastname);
			
		}

	}

}

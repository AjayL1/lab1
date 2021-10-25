package lab5;

import java.util.*;//to import scanner

class SalaryException extends Exception {
	public SalaryException(String str) {
		System.out.println(str);
	}
	}
public class EmployeeException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//to read input
		System.out.println("Enter the amount");
		int salary=sc.nextInt();
		//if salary is less than 3000 it throws exception
		try {
			if(salary<3000)
				throw new SalaryException("Invalid Employee Salary");
			else
				System.out.println("valid Employee Salary");
		}
		catch(SalaryException s) {
			System.out.println(s);
		}
	}
}

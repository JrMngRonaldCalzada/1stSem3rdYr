package SecondYearOOP;
import java.io.*;

class Account {
	private String bank_name;
	private long Account_number; 
	
 Account(String bank_name, long Account_number) { 
	 
	this.bank_name = bank_name;
	this.Account_number = Account_number;
}
 
 public String getBankName() {
	 return this.bank_name;
 }
 
 public long getAccountNumber() {
	 return this.Account_number;
 }
}
 class Employee {
	 private String emp_name;
	 
	 Employee(String emp_name) {
		 this.emp_name = emp_name;
	 }
	 
	 public String getEmployeeName() {
		 return this.emp_name;
	 }
 }

public class Blanco {
	 public static void main(String[] args) {
		 
		 Employee emp = new Employee("Andrew");
		 Account acc = new Account("Citi Bank", 13319);
		 
		 System.out.println(emp.getEmployeeName() + " has an account with " 
				 + acc.getBankName() 
		 		 + " with Account Number "
				 + acc.getAccountNumber());
	}
}
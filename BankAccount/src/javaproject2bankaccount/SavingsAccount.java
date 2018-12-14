/*Name:  Bryan Bastida

 Student ID: G71171689

 COP 2800 - Java Programming 

 Fall 2015 - T Th 6:00PM - 9:20PM

 Project # 4

 Plagiarism Statement

 I certify that this assignment is my own work and that I
 have not copied in part or whole or otherwise plagiarized 
 the work of other students and/or persons.

1234567890123456789012345678901234567890123456789012345678901234567890
*/
package javaproject2bankaccount;

public class SavingsAccount extends BankAccount{
	
	private double interest;
	
	SavingsAccount(){
		this(0);
	}
	
	SavingsAccount(double accountBalance){
		setAccountBalance(accountBalance);
	}
	
	//this method will add the monthly interest rate 
	//to the account balance
	public void addInterest(){
		setAnnualInterestRate(4.5);
		double accountBalance = getAccountBalance();
		this.interest = getMonthlyInterestRate();
		accountBalance += interest;
		setAccountBalance(accountBalance);
	}
}
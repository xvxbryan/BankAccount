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

public class CurrentAccount extends BankAccount{
	
	private double overdraftLimit;
	
	CurrentAccount(){
		this(0);
	}
	
	CurrentAccount(double accountBalance){
		setAccountBalance(accountBalance);
		setOverdraftLimit();
	}
	
	private void setOverdraftLimit() {
		this.overdraftLimit = -30;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}
}
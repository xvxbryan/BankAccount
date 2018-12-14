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

import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

public class BankAccount {
	
	private int accountId;
	private double accountBalance;
	private static double annualInterestRate;
	private Date dateCreated = new Date();
	private String name;
	private String password;

	BankAccount(){
		this(0, "");
	}
	
	BankAccount(double accountBalance, String name){
		setAccountBalance(accountBalance);
		setAccountId();
		setPassword(password);
		setName(name);
	}
	
	//this method allows the user to set their starting balance
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	//this method allows the bank to set the annual interest
	public void setAnnualInterestRate(double annualInterestRate) {
		BankAccount.annualInterestRate = annualInterestRate;
	}
	
	//this method will return the account ID
	public int getAccountId() {
		return accountId;
	}
	
	//this method allows the system to generate a new ID for the user
	private void setAccountId(){
		Random randNum = new Random();
		accountId = randNum.nextInt(10000);
		
		while(accountId < 1000){
			accountId = randNum.nextInt(10000);
		}
	}
	
	//this method will return the account balance
	public double getAccountBalance() {
		return accountBalance;
	}
	
	//this method will return the annual interest rate
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	//this method will return the date the account was created
	public Date getDateCreated() {
		dateCreated.toString();
		return dateCreated;
	}
	
	//this method will return the monthly interest rate
	public double getMonthlyInterestRate(){
		double monthlyInterestRate = annualInterestRate/12;
		
		return monthlyInterestRate;
	}
	
	//this method allows the user to withdraw money
	public void withdraw(double withdraw){
		if(withdraw < 0)
			JOptionPane.showMessageDialog(null, "Invalid withdraw amount");
		else{
			accountBalance = accountBalance - withdraw;
		}
	}
	
	//this method allows the user to deposit money
	public void deposit(double deposit){
		if(deposit < 0)
			JOptionPane.showMessageDialog(null, "Invalid deposit amount");
		else{
			accountBalance = accountBalance + deposit;
		}
	}
	
	//this method gets the users name
	public String getName() {
		return name;
	}

	//this method sets the users name
	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	private void setPassword(String password) {
		String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i",
				  "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", 
				  "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", 
				  "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", 
				  "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

		int[] randNumArray = new int[4];
		
		Random randGenerator = new Random();
		
		int randInt = 0;
		this.password = "";
		for(int i = 0; i < randNumArray.length; i++){
			randInt = randGenerator.nextInt(52);
			this.password += letters[randInt];
		}		
	}
}
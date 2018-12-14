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

import javax.swing.JOptionPane;

public class TestBankAccount {

	public static void main(String[] args) {
		
		bankMenu();
	}
	
	//this method will print the bank menu 
	//and allow the user to make a choice
	public static void bankMenu(){
		
		Object[] menuOptions = {"---Please choose from one of the "
				+ "following options---","Create a new account", 
				"Deposit", "Withdraw", "Display balance", "Exit"};
			
		Object choice = JOptionPane.showInputDialog(null, 
		"Welcome to MDC Bank.", "Menu", 
		JOptionPane.INFORMATION_MESSAGE, null, menuOptions, 
		menuOptions[0]);
		
		if(choice == menuOptions[0]){
			bankMenu();
		}
		
		else if(choice == menuOptions[1]){
			openBankAccount();
			bankMenu();
		}
		
		else if(choice == menuOptions[2]){
			deposit();
			bankMenu();
		}
		
		else if(choice == menuOptions[3]){
			withdraw();
			bankMenu();
		}
		
		else if(choice == menuOptions[4]){
			accountBalance();
			bankMenu();
		}
		
		else if(choice == menuOptions[5]){
			
			int exit = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?");
			
			if(exit == JOptionPane.YES_OPTION){
				System.exit(0);
			}
			
			if(exit == JOptionPane.NO_OPTION){
				bankMenu();
			}
		}
	}
	
	//this method calls the openAccount method from the Bank class
	public static void openBankAccount(){
		Bank accounts = new Bank();
		accounts.openAccount();
	}
	
	//this method calls the deposit method from the Bank class
	public static void deposit(){
		Bank accounts = new Bank();
		accounts.deposit();
	}
	
	//this method calls the withdraw method from the Bank class
	public static void withdraw(){
		Bank accounts = new Bank();
		accounts.withdraw();
	}
	
	//this method calls the withdraw method from the Bank class
	public static void accountBalance(){
		Bank accounts = new Bank();
		accounts.accountBalance();
	}
}
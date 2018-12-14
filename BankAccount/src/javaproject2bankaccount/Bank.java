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

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Bank {
	
	private static ArrayList<BankAccount> bankAccounts = 
				   new ArrayList<BankAccount>();
	Bank(){
	}
	
	//this method will add interest to any savings account 
	//and tell the user if they have over drafted 
	//in their current account
	public static void update(){
		
		for(int i = 0; i < bankAccounts.size(); i++){
			
			if(bankAccounts.get(i) instanceof CurrentAccount){
				if(bankAccounts.get(i).getAccountBalance() < 
				  ((CurrentAccount) bankAccounts.get(i)).
				  					getOverdraftLimit()){
					JOptionPane.showMessageDialog(null, "You are in "
												   + "overdrafted");
				}
			}
			else if(bankAccounts.get(i) instanceof SavingsAccount){
				((SavingsAccount) bankAccounts.get(i)).addInterest();
			}
		}
	}
	
	//this method will open up an account according to the user input
	public void openAccount(){
		
		String name = JOptionPane.showInputDialog("Please enter your "
													+ "name");
		
		String accountString 		= "";
		double accountBalanceAmount = 0;
		
		Object[] menuOptions = {"Regular", "Savings", "Current"};
			
		Object choice = JOptionPane.showInputDialog(null, 
				"What type of account would you like to open?", 
				"Menu", JOptionPane.INFORMATION_MESSAGE, null, 
				menuOptions, menuOptions[0]);
		
		if(choice == menuOptions[0]){
			BankAccount newAccount = new BankAccount();
			
			try{
				accountString = JOptionPane.showInputDialog("Enter "
									 + "starting account balance.");
				
				accountBalanceAmount = Double.parseDouble(accountString);
				
				newAccount.setAccountBalance(accountBalanceAmount);
				
				if(newAccount.getAccountBalance() == 0){
					JOptionPane.showMessageDialog(null, "You have no money"
							+ " in your account."+ "\nMake sure you make a "
									+ "deposit before trying to withdraw.");
				}
			}
			catch(NullPointerException e){
				JOptionPane.showMessageDialog(null, "You have no money"
						+ " in your account."+ "\nMake sure you make a "
								+ "deposit before trying to withdraw.");
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "You have no money "
						+ "in your account."+ "\nMake sure you make a "
								+ "deposit before trying to withdraw.");
			}
			
			if(name == null || name.isEmpty()){
				do{
					name = JOptionPane.showInputDialog("You have not "
							+ "entered a name yet. \n Please enter your "
							+ "name to continue");
					if(name == null){
						
						int exit = JOptionPane.showConfirmDialog(null, 
								"Would you like to exit the program?");
						if(exit == JOptionPane.YES_OPTION){
							System.exit(0);
						}
					}
				}while(name == null || name.isEmpty());
			}
			newAccount.setName(name);
			
			JOptionPane.showMessageDialog(null, "Name: " +
					newAccount.getName() +"\nAccount balance: "+ 
					newAccount.getAccountBalance() +"\nID: "+ 
					newAccount.getAccountId() + "\nPassword: "+
					newAccount.getPassword());
			
			bankAccounts.add(newAccount);
		}
		
		if(choice == menuOptions[1]){
			SavingsAccount newSavings = new SavingsAccount();

			try{
				accountString = JOptionPane.showInputDialog("Enter "
									+ "starting account balance.");
				
				accountBalanceAmount = Double.parseDouble(accountString);
				
				newSavings.setAccountBalance(accountBalanceAmount);
				
				if(newSavings.getAccountBalance() == 0){
					JOptionPane.showMessageDialog(null, "You have no money"
							+ " in your account."+ "\nMake sure you make a "
									+ "deposit before trying to withdraw.");
				}
			}
			catch(NullPointerException e){
				JOptionPane.showMessageDialog(null, "You have no money "
						+ "in your account."+ "\nMake sure you make a "
						+ "deposit before trying to withdraw.");
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "You have no money "
						+ "in your account.\nMake sure you make a "
						+ "deposit before trying to withdraw.");
			}
			
			if(name == null || name.isEmpty()){
				do{
					name = JOptionPane.showInputDialog("You have not "
							+ "entered a name yet. \n Please enter "
							+ "your name to continue");
					if(name == null){
						
						int exit = JOptionPane.showConfirmDialog(null, 
								"Would you like to exit the program?");
						if(exit == JOptionPane.YES_OPTION){
							System.exit(0);
						}
					}
				}while(name == null || name.isEmpty());
			}
			newSavings.setName(name);
			
			JOptionPane.showMessageDialog(null, "Name: " + 
					newSavings.getName() +"\nAccount balance: "+ 
					newSavings.getAccountBalance() +"\nID: "+ 
					newSavings.getAccountId() + "\nPassword: "+
					newSavings.getPassword());
			
			bankAccounts.add(newSavings);
			
			update();
		}
		
		if(choice == menuOptions[2]){
			
			CurrentAccount newCurrent = new CurrentAccount();
			
			try{
				accountString = JOptionPane.showInputDialog("Enter "
									+ "starting account balance.");
				
				accountBalanceAmount = Double.parseDouble(accountString);
				
				newCurrent.setAccountBalance(accountBalanceAmount);
				
				if(newCurrent.getAccountBalance() == 0){
					JOptionPane.showMessageDialog(null, "You have no money"
							+ " in your account."+ "\nMake sure you make a "
									+ "deposit before trying to withdraw.");
				}
			}
			catch(NullPointerException e){
				JOptionPane.showMessageDialog(null, "You have no money "
						+ "in your account.\nMake sure you make a "
						+ "deposit before trying to withdraw.");
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "You have no money "
						+ "in your account.\nMake sure you make a "
						+ "deposit before trying to withdraw.");
			}
			
			if(name == null || name.isEmpty()){
				do{
					name = JOptionPane.showInputDialog("You have not "
							+ "entered a name yet. \n Please enter your "
							+ "name to continue");
					if(name == null){
						
						int exit = JOptionPane.showConfirmDialog(null, 
								"Would you like to exit the program?");
						if(exit == JOptionPane.YES_OPTION){
							System.exit(0);
						}
					}
				}while(name == null || name.isEmpty());
			}
			newCurrent.setName(name);
			
			JOptionPane.showMessageDialog(null, "Name: " + 
					newCurrent.getName() + "\nAccount balance: "+ 
					newCurrent.getAccountBalance() + "\nID: "+ 
					newCurrent.getAccountId() + "\nPassword: "+
					newCurrent.getPassword());
			
			bankAccounts.add(newCurrent);
			update();
		}
	}
	
	//allows you to deposit to a specific account
	public void deposit(){
		
		String amountString = "";
		double amount = 0;
		String idString = "";
		
		try{
			amountString = JOptionPane.showInputDialog("Enter the "
								  + "amount you wish to deposit.");
			
			while(amountString.isEmpty()){
				amountString = JOptionPane.showInputDialog("Enter the "
									  + "amount you wish to deposit.");
			}
			amount = Double.parseDouble(amountString);
			
			idString = JOptionPane.showInputDialog("Enter your account"
															+ " ID.");
			int id = Integer.parseInt(idString);
			
			String password = JOptionPane.showInputDialog("Enter your "
														+ "password.");
			
			boolean accountExist = false;
			
			for(int i = 0; i < bankAccounts.size(); i++){
				
				if(bankAccounts.get(i).getAccountId() == id && 
				bankAccounts.get(i).getPassword().equals(password)){
					
					accountExist = true;
					bankAccounts.get(i).deposit(amount);
				}
			}
			if(accountExist == false){
				JOptionPane.showMessageDialog(null, "Account does "
												+ "not exist.");
			}
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Invalid input. "
									+ " Returning to main menu.");
		}
		catch(NullPointerException e){
			
		}
	}
	
	//allows you to withdraw from a certain account
	public void withdraw(){
		
		String amountString = "";
		try{
			amountString = JOptionPane.showInputDialog("Enter the"
								+ " amount you wish to withdraw.");
			while(amountString.isEmpty()){
				amountString = JOptionPane.showInputDialog("Enter "
							 + "the amount you wish to withdraw.");
			}
			double amount = Double.parseDouble(amountString);
			
			String idString = "";
			idString = JOptionPane.showInputDialog("Enter your "
												+ "account ID.");
			int id = Integer.parseInt(idString);
			
			String password = JOptionPane.showInputDialog("Enter "
												+ "your password.");
			
			boolean accountExist = false;
			
			for(int i = 0; i < bankAccounts.size(); i++){
				
				if(bankAccounts.get(i).getAccountId() == id && 
				bankAccounts.get(i).getPassword().equals(password)){
					
					accountExist = true;	
					bankAccounts.get(i).withdraw(amount);
					update();
				}
			}
			
			if(accountExist == false){
				JOptionPane.showMessageDialog(null, "Account does "
													+ "not exist.");		
			}
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Invalid input. "
									+ "Returning to main menu.");
		}
		catch(NullPointerException e){
			
		}
	}
	
	public void accountBalance(){
		
		String idString = "";
		
		try{
			while(idString == null || idString.equals("")){
				
				if(idString == null){
					int exit = JOptionPane.showConfirmDialog(null,
										"Would you like to exit?");
					
					if(exit == JOptionPane.YES_OPTION){
						System.exit(0);
					}
				}
				idString = JOptionPane.showInputDialog("Enter "
											+ "your account ID.");
			}
			int id = Integer.parseInt(idString);
			
			String password = JOptionPane.showInputDialog("Enter "
												+ "your password.");
			
			boolean accountExist = false;
			
			for(int i = 0; i < bankAccounts.size(); i++){
				
				if(bankAccounts.get(i).getAccountId() == id && 
				bankAccounts.get(i).getPassword().equals(password)){
					
					accountExist = true;
					
					JOptionPane.showMessageDialog(null, 
					"Account balance is: " + 
					bankAccounts.get(i).getAccountBalance() +
					"\nInterest rate is: " + 
					bankAccounts.get(i).getMonthlyInterestRate()+
					"\nDate created was: " + 
					bankAccounts.get(i).getDateCreated());
				}
			}
			if(accountExist == false){
				if(bankAccounts.isEmpty()){
					JOptionPane.showMessageDialog(null, 
							"Account does not exist.");
				}
			}
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Invalid input."
									+ " Returning to main menu.");
		}
	}
}
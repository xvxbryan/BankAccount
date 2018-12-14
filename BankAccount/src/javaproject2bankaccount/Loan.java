package javaproject2bankaccount;

import java.util.Date;

public class Loan {
	
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;
	
	Loan(){
		
		this(0.025, 1, 1000);
			
	}
	
	Loan(double annualInterestRate, int numberOfYears, double loanAmount){
		
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public double getMonthlyPayment(){
		
		double monthlyPayment = 0;
		
		monthlyPayment = ((loanAmount * annualInterestRate) * numberOfYears) / 12;
		
		return monthlyPayment;
		
	}
	
	public double getTotalPayment(){
		
		double totalPayment = 0;
		
		return totalPayment;
		
	}	
}
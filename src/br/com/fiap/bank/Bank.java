package br.com.fiap.bank;

public class Bank {
	int number;
	int agency;
	double balance;

	public Bank(int number, int agency, double balance) {
		this.setNumber(number);
		this.setAgency(agency);
		this.setBalance(balance);
	}

	public void deposit(double value) {
		this.balance += value;
	}

	public void withdraw(double value) {
		this.balance -= value;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getAgency() {
		return agency;
	}

	public void setAgency(int agency) {
		this.agency = agency;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}

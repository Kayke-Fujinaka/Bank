package br.com.fiap.bank;

public class BankAccount {
	int number;
	int agency;
	double balance;

	private static final String INVALID_DEPOSIT_MESSAGE = "Insira um valor positivo para depósito.";

	public BankAccount(int number, int agency, double balance) {
		this.setNumber(number);
		this.setAgency(agency);
		this.setBalance(balance);
	}

	public void deposit(double amount) {
		if (!isValidDepositAmount(amount)) {
			System.out.println(INVALID_DEPOSIT_MESSAGE);
			return;
		}

		this.balance += amount;
	}

	private boolean isValidDepositAmount(double amount) {
		return amount >= 0;
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

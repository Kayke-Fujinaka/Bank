package br.com.fiap.bank;

public class BankAccount {
	public int number;
	public int agency;
	public double balance;

	private static final String NEGATIVE_AMOUNT_MESSAGE = "Insira um valor positivo.";
	private static final String INSUFFICIENT_FUNDS_MESSAGE = "Saldo insuficiente.";

	public BankAccount(int number, int agency, double balance) {
		this.setNumber(number);
		this.setAgency(agency);
		this.setBalance(balance);
	}

	public void deposit(double amount) {
		if (isNegativeAmount(amount)) {
			System.out.println(NEGATIVE_AMOUNT_MESSAGE);
			return;
		}

		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (isNegativeAmount(amount)) {
			System.out.println(NEGATIVE_AMOUNT_MESSAGE);
			return;
		}

		if (isInsufficientFunds(amount)) {
			System.out.println(INSUFFICIENT_FUNDS_MESSAGE);
			return;
		}

		this.balance -= amount;
	}

	private boolean isNegativeAmount(double amount) {
		return amount < 0;
	}

	private boolean isInsufficientFunds(double amount) {
		return amount > this.balance;
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

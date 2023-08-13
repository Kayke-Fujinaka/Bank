package br.com.fiap.bank;

public class BankAccount {
	private int number;
	private int agency;
	private double balance;

	private static final String NEGATIVE_AMOUNT_MESSAGE = "Insira um valor positivo.";
	private static final String INSUFFICIENT_FUNDS_MESSAGE = "Saldo insuficiente.";

	public BankAccount(int number, int agency, double balance) {
		this.setNumber(number);
		this.setAgency(agency);
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (isNegativeAmount(amount)) {
			throw new NegativeAmountException(NEGATIVE_AMOUNT_MESSAGE);
		}

		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (isNegativeAmount(amount)) {
			throw new NegativeAmountException(NEGATIVE_AMOUNT_MESSAGE);
		}
		if (isInsufficientFunds(amount)) {
			throw new InsufficientFundsException(INSUFFICIENT_FUNDS_MESSAGE);
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
}

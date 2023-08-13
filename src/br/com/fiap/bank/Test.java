package br.com.fiap.bank;

public class Test {
	public static void main(String[] args) {
		BankAccount checkingAccount = new BankAccount(0, 0, 0);
		checkingAccount.setBalance(1000);
		checkingAccount.setAgency(123);
		checkingAccount.setNumber(321);

		checkingAccount.deposit(100);

		System.out.println(checkingAccount.getBalance());

		BankAccount savingsAccount = new BankAccount(100, 123, 1000);

		savingsAccount.withdraw(50);

		System.out.println(savingsAccount.getBalance());
	}
}
package br.com.fiap.bank;

public class Test {
	public static void main(String[] args) {
		BankAccount checkingAccount = new BankAccount(0, 0, 1000);
		try {
			checkingAccount.deposit(50);
			System.out.println(checkingAccount.getBalance());
		} catch (NegativeAmountException e) {
			System.out.println(e.getMessage());
		}

		try {
			checkingAccount.withdraw(100);
			System.out.println(checkingAccount.getBalance());
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
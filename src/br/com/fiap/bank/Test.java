package br.com.fiap.bank;

public class Test {
	public static void main(String[] args) {
		Bank cc = new Bank(0, 0, 0);
		cc.balance = 1000;
		cc.agency = 123;
		cc.number = 321;

		cc.deposit(100);

		System.out.println(cc.getBalance());

		Bank savings = new Bank(100, 123, 1000);

		savings.withdraw(50);

		System.out.println(savings.getBalance());
	}
}
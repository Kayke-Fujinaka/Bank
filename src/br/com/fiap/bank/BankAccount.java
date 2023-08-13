package br.com.fiap.bank;

public class BankAccount {
  private int number;
  private int agency;
  private double balance;

  public BankAccount() {
  }

  public BankAccount(int number, int agency, double balance) {
    this.setNumber(number);
    this.setAgency(agency);
    this.balance = balance;
  }

  public void deposit(double amount) {
    validateAmount(amount);
    this.balance += amount;
  }

  public void withdraw(double amount) {
    validateAmount(amount);
    if (isInsufficientFunds(amount)) {
      throw new InsufficientFundsException();
    }
    this.balance -= amount;
  }

  private void validateAmount(double amount) {
    if (isNegativeAmount(amount)) {
      throw new NegativeAmountException();
    }
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

class NegativeAmountException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public NegativeAmountException() {
    super("Insira um valor positivo.");
  }
}

class InsufficientFundsException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public InsufficientFundsException() {
    super("Saldo insuficiente.");
  }
}

package br.com.fiap.bank;

class NegativeAmountException extends RuntimeException {
	public NegativeAmountException(String message) {
		super(message);
	}
}

package com.raju.atm;

import java.util.Date;

class System {
	ReadCard readCard;
	CashDispenser cashDispenser;
	CashDeposit cashDeposit;
	Printer printer;
	KeyPad keypad;
	User user;
	Manager manager;

	void validate() {

	}
}

public class atm {
}

enum Message {
	DEPOSIT_SUCCESS, TRANSCATION_FAILED, INSUFFICIENT_BALANCE, CARD_EXPIRED, CONTACT_BRANCH, OUT_OF_SERVICE
}

class Card {
	private String name;
	private int cardNumber;
	private Date expiryDate;
	private int cvv;
	private String password;
}

class ReadCard {
	private Card card;
	private double balance;

	public Message authenticate(Card card) {
		return Message.CARD_EXPIRED;
	}
}

class CashDispenser {
	ReadCard readCard;

	public int dispenseCash() {
		return 0;
	}
}

class CashDeposit {
	ReadCard readCard;

	public Message depositCash() {
		return Message.DEPOSIT_SUCCESS;
	}
}

class Screen {
	Message message;

	void displayMessage(Message message) {

	}
}

class KeyPad {
	int[][] keys;

	void pressKey() {
	}
}

class Reciept {
	Message message;

	void createReciept(Message message) {

	}
}

class Printer {
	Reciept reciept;

	void printReciept(Reciept reciept) {

	}
}

class User {
	Card card;

	void deposit(Card card) {

	}

	void withDraw(Card card) {

	}
}

class Manager {
	String key;

	void refillATM(String key) {
	}

	void collectFromATM(String key) {
	}
}
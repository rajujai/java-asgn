package com.raju.hotelMgmt;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

enum Aminities {
	GymAccess, PoolAccess, PlayArea
}

enum BookingStatus {
	BOOKED, AVAILABLE, NOT_AVAILABLE, PENDING, CANCELLED
}

enum PaymentMethod {
	CREDITCARD, CHEQUE, CASH
}

enum Gender {
	MALE, FEMALE, OTHERS
}

public class HotelMgmtSystem {
	private List<Room> roomsList;
	private List<RegisteredCustomer> registeredCustomers;

	void login() {

	}

	void register(RegisteredCustomer customer) {
		this.registeredCustomers.add(customer);
	}

	void logOut() {

	}
}

abstract class Room {
	private List<Date> availableDate;

	abstract void checkIn();

	abstract void checkOut();
}

class StandardRoom extends Room {
	private BookingStatus status = BookingStatus.AVAILABLE;
	private double price;

	@Override
	public void checkIn() {

	}

	@Override
	public void checkOut() {

	}

}

class DeluxeRoom extends Room {
	private double price;
	private BookingStatus status = BookingStatus.AVAILABLE;

	@Override
	public void checkIn() {

	}

	@Override
	public void checkOut() {

	}

}

class FamilyRoom extends Room {
	private BookingStatus status = BookingStatus.AVAILABLE;
	private double price;

	@Override
	public void checkIn() {

	}

	@Override
	public void checkOut() {

	}

}

class Booking {
	private Person guest;
	private List<Room> room;
	private LocalDate checkIn;
	private LocalDate checkOut;
	private PaymentMethod payment;

}

abstract class Person {
	private String name;
	private Gender gender;
	private int age;
	private int phoneNum;

	abstract void searchRoom();
}

class Guest extends Person {

	private Aminities aminities;

	@Override
	public void searchRoom() {

	}

	public void addFood() {

	}

	public void callRoomServices() {

	}
}

class NonRegisteredCustomer extends Person {

	@Override
	public void searchRoom() {

	}

}

class RegisteredCustomer extends Person {
	private Booking book;
	public boolean CancelBooking(Room room) {
		return false;
	}
	@Override
	public void searchRoom() {

	}

}
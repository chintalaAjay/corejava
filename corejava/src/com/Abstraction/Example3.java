package com.Abstraction;


abstract class Payment{
	public abstract void processPayment();
	public abstract void validateTransaction();
	public void genarateTransactionId() {
		System.out.println("genarating transaction id : "+(long)(Math.random()*1000000000));
	}
	
}
class crediCardPayment extends Payment{
	String cardNumber;
	String date;
	int cvv;

	@Override
	public void processPayment() {
		System.out.println("processing creditcard Payment");
		
	}

	@Override
	public void validateTransaction() {
		System.out.println("validating transaction "+cardNumber+" , "+date+" , and "+cvv+" ..");
		
	}
	public crediCardPayment(String cardNumber,String date,int cvv) {
		this.cardNumber=cardNumber;this.date=date;
		this.cvv=cvv;
		processPayment();
		validateTransaction();
		genarateTransactionId();
	}
	
}
class UpiPayment extends Payment{
	String upiid;
	long phoneNumber;
	@Override
	public void processPayment() {
		System.out.println("processing upi payment");
	}
	@Override
	public void validateTransaction() {
		System.out.println("validating upiid and mobileNumber");
	}
	public UpiPayment(String upiid,long phoneNumber) {
		this.upiid=upiid;
		this.phoneNumber=phoneNumber;
		processPayment();
		validateTransaction();
		genarateTransactionId();
	}
	
}

class PayPalPayment extends Payment{
	String email;
	String authToken;
	@Override
	public void processPayment() {
		System.out.println("processing paypalpayment");
	}
	@Override
	public void validateTransaction() {
		System.out.println("validating email and authentication");
	}
	public PayPalPayment(String email,String authToken) {
		this.email=email;
		this.authToken=authToken;
		processPayment();
		validateTransaction();
		genarateTransactionId();
	}
	
}

public class Example3 {

	public static void main(String[] args) {
		crediCardPayment cp=new crediCardPayment("Dl856204621", "19/28", 156);
		UpiPayment up=new UpiPayment("9553891082", 9553891082L);
	}

}

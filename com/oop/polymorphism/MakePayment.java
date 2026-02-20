package com.oop.polymorphism;
import java.util.*;

abstract class Payment{
	protected double amount;
	protected String transactionId;
	
	
	public Payment(double amount) {
		super();
		this.amount = amount;
		this.transactionId="TXN"+System.currentTimeMillis();
	}

	public abstract void pay() ;
	
	public void printRecepit() {
		System.out.println("TransactionId:"+this.transactionId);
		System.out.println("Amount:"+this.amount);
	}
}
class UpiPayment extends Payment{
	private String upiId;

	public UpiPayment(double amount, String upiId) {
		super(amount);
		this.upiId = upiId;
	}

	@Override
	public void pay() {
		System.out.println("Paying $:"+super.amount+" through upi id"+this.upiId);
		System.out.println("Upi payment is Successfull");
		
	}
	
}
class Cardpayment extends Payment{
	private String cardNumber;

	public Cardpayment(double amount, String cardNumber) {
		super(amount);
		this.cardNumber = cardNumber;
	}

	@Override
	public void pay() {
	System.out.println("paying $:"+this.amount+" through card ending:"+
	this.cardNumber.substring(this.cardNumber.length()-4));
	System.out.println("Card psyment is Successfull");
		
	}
	
}
public class MakePayment {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int i=1;
		while(i!=0) {
			System.err.println("1.Upi 2.Card 3.Exit");
			int choice=sc.nextInt();
			Payment pay =null;
			switch(choice) {
			case 1: pay= new UpiPayment(1200,"8639458525@ybl");
			   		pay.pay();
			   		pay.printRecepit();
			   		System.out.println("----------------------------");
			   		break;
			case 2: pay = new Cardpayment(5688, "7894563210225");
					pay.pay();
					pay.printRecepit();
					System.out.println("----------------------------------------");
					break;
			case 3: i=0;
					System.out.println("Exit from the Transaction!!!");
					break;
			default:System.out.println("Invalid Option");
				}
		}
		
	}

}

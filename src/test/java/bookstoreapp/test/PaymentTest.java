package bookstoreapp.test;

import java.util.Scanner;

import bookstoreapp.UserValidation;
import bookstoreapp.main.Payment;

public class PaymentTest {

	public static void main(String[] args) throws Exception {
		items();
	}

	public static void items() throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the price");
		Integer Price = sc.nextInt();
		System.out.println("enter deliverycharges");
		Integer deliverycharges = sc.nextInt();
		System.out.println("amountpaid");
		Integer amountpaid = sc.nextInt();

		Payment payment = new Payment();
		payment.setPrice(Price);
		payment.setDeliverycharges(deliverycharges);
		payment.setAmountpaid(amountpaid);

	}
}

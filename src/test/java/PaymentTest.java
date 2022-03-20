import bookstoreapp.Payment;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Payment payment = new Payment();
payment.setPrice(500);
payment.setDeliverycharges(60);
payment.setAmountpaid(560);

System.out.println(payment);
	}

}

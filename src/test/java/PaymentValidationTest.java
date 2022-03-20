import bookstoreapp.Payment;
import bookstoreapp.PaymentValidation;

public class PaymentValidationTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Payment bookpayment = new Payment();
bookpayment.setPrice(700);
bookpayment.setDeliverycharges(80);
bookpayment.setAmountpaid(780);
	
	System.out.println(bookpayment);
	PaymentValidation.paymentValidation(bookpayment);

}
}

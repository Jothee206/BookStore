package bookstoreapp;

public class PaymentValidation {

	public static void paymentValidation(Payment bookpayment)throws Exception{
		if(bookpayment.getPrice()==0) {
			throw new Exception("price cannot be null");//raise an problem
		}
		else if(bookpayment.getDeliverycharges()==0) {
			throw new Exception("deliverychargescannot be null");
		}
		else if(bookpayment.getAmountpaid() ==0) {
			throw new Exception("invalid titlename");
		}
		}
}


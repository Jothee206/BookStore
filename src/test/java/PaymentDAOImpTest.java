import bookstoreapp.Payment;
import bookstoreapp.PaymentDAOImpl;

public class PaymentDAOImpTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Payment bookpayment = new Payment();
bookpayment.setPrice(800);
bookpayment.setDeliverycharges(80);
bookpayment.setAmountpaid(880);
	
PaymentDAOImpl paymentDaoImp= new PaymentDAOImpl();
paymentDaoImp.details(bookpayment);
	}

}

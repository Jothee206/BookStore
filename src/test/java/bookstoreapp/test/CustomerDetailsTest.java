
package bookstoreapp.test;

import bookstoreapp.DAO.CustomerDetailsDAOImpl;
import bookstoreapp.main.CustomerDetails;

import java.util.Scanner;

public class CustomerDetailsTest {

	public static void main(String[] args) throws Exception {
		items();
	}

	public static void items() throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter customer_Name");
		String Customer_Name = sc.next();
		System.out.println("enter contact_number");
		String number = sc.next();
		System.out.println("enter address");
		String address = sc.next();
		System.out.println("enter city");
		String city = sc.next();
		System.out.println("enter price");
		String price = sc.next();
		System.out.println("enter booktitle");
		String booktitle = sc.next();
		System.out.println("enter totalamount");
		String totalAmount = sc.next();
		System.out.println(booktitle);

		// TODO Auto-generated method stub
		CustomerDetails customerdetails = new CustomerDetails();
		customerdetails.setCustomer_Name(Customer_Name);
		customerdetails.setContact_number(number);
		customerdetails.setAddress(address);
		customerdetails.setCity(city);
		customerdetails.setPrice(price);
		customerdetails.setBooktitle(booktitle);
		customerdetails.setTotalAmount(totalAmount);

		CustomerDetailsDAOImpl.adddetails(customerdetails);
	}

}

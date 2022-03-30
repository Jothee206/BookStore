package bookstoreapp.test;

import java.util.Scanner;


	public class HomePage {

		public static void main(String[] args)  throws Exception{
			items();
		}
		
		
		public static void items() throws Exception{
			// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("1. welcome! Register");
	  System.out.println("2. login");
	  int n=sc.nextInt();
	  
	  
	if(n==1) {
		UserTest.items();
		
	}
	
	else if(n==2) {
		UserLoginTest.items();
		BookitemsViewTest.items();
		System.out.println("\t\tDisplay by categories");
		BookitemsViewTest.items1();
		BookitemsViewTest.items2();
		
		System.out.println("\t\t order the book");
		BookitemsOrderTest.items();
		
		System.out.println("update the order");
		UpdateBookitemsOrderTest.items();
		
		System.out.println("\t\t Enter customer details");
		CustomerDetailsTest.items();
		
		
		System.out.println("\t\tDisplay the payment details");
		PaymentTest.items();

		System.out.println("\t\tyour order is completed");
		System.out.println("soon you will receive the order");
		System.out.println("\t\tThank you");
	}
	else {
		System.out.println("exit");
	}
		}
	}

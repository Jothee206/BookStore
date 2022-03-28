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
		items();
	}
	else if(n==2) {
		UserLoginTest.items();
	}
	else {
		System.out.println("exit");
	}
		}
	}

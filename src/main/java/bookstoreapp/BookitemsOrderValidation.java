package bookstoreapp;

public class BookitemsOrderValidation {

	
		public static void Validationbookitemsorder(BookitemsOrder bookitemsorder) throws Exception {

			if (bookitemsorder.getAddress() == null) {
				throw new Exception(" Address is invalid");
			}
			else if (bookitemsorder.getCity() == null) {
				throw new Exception("City is invalid");
			}
			//if(bookitemsorder.getBookname()==null) {
				//throw new Exception("book name cannot be null");
			
			else if (bookitemsorder.getCustomername() == null) {
				throw new Exception("invalid customer");
			}
		    else if (bookitemsorder.getPrice() == 0) {
				throw new Exception("Price is Invalid");
			} 
		    else if (bookitemsorder.getContactNumber() == null) {
				throw new Exception("invalid contactnumber");
			} 
		    else if (bookitemsorder.getTotalAmount() == 0) {
				throw new Exception("amount is not valid");
			} 
			System.out.println("validation Succesfull");
		}
	}

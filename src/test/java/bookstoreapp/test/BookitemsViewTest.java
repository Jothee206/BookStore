package bookstoreapp.test;

import java.util.ArrayList;
import java.util.List;

import bookstoreapp.main.Bookitems;
import bookstoreapp.main.BookitemsOrder;
import bookstoreapp.main.BookitemsView;

import java.util.ArrayList;
public class BookitemsViewTest {
	
public static  void main(String[] args) throws Exception   {
	items();
}


public static void items() throws Exception{

//public static void test() throws Exception{
List<Bookitems> book=new ArrayList<Bookitems>();
			book=BookitemsView.showAll();
	showAll(book);
}
	public static  void main1(String[] args) throws Exception   {
		items1();
	}


	public static void items1() throws Exception{

	List<Bookitems> bookcategory=new ArrayList<Bookitems>();
	bookcategory =BookitemsView.bookcategories();
categories( bookcategory);

   
}
public static void showAll(List<Bookitems> book) {
	System.out.println("Bookcategories  Booktitle  Authorname  Price");
for(Bookitems i:book){
			System.out.println(i.getAuthorname()+"\t"+i.getBookcategories()+"\t"+i.getBooktitle()+"\t"+i.getPrice());
		}
	}


public static void categories(List<Bookitems> bookcategory) {
	for(Bookitems i:bookcategory) {
		System.out.println(i.getBookcategories());
	}
	
}
}




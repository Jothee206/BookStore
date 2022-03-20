import java.util.List;

import bookstoreapp.Bookitems;

public interface IBookitemsDAO {
  
	  void addBookitems(Bookitems bookitems) throws Exception;
	  
	  void updateBookitems(Bookitems bookitems) throws Exception;
	  
	  void deleteBookitems(int id) throws Exception;
	  
	  //select * from bookitems// 1 or more row
	  List<Bookitems> findAll() throws Exception;
	  
	  //select * from bookitems where id=?
	  Bookitems findBy (int id) throws Exception;
	  
	  //findby author name
	  List<Bookitems> findByauthorName(String authorname) throws Exception;
	  
		//select count(*) from bokitems // 1 row-1 column
	  int count() throws Exception;
	  
	  //findby title name
	  Bookitems findBytitleName(int titlename) throws Exception;
	  
	  
	  //search by categories
	  List<Bookitems> findByCategories (String categoriesname) throws Exception;
}
	  
	  


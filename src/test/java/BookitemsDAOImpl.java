import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bookstoreapp.Bookitems;

public class BookitemsDAOImpl  implements IBookitemsDAO{
	 
	//1st method:addbookitems
	public List<Bookitems> addBookitems1(Bookitems bookitems) throws Exception {
		 //List<Bookitems> addBookitems1() throws Exception {
				List<Bookitems> BookitemsList1 = new ArrayList<Bookitems>();
	     Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		// 1.Get connection
		connection = ConnectionUtil.getConnection();
		// 2. Prepare the query
				String sql = "insert into bookitems (bookcategories,authorname,booktitle,price) values (?,?,?,?)";
				statement = connection.prepareStatement(sql);
				statement.setString(1, "authornam");
				statement.setString(2, "titlename");
				statement.setInt(3, 0);
				//3.execute query
				rs = statement.executeQuery();
				
				//iterate rows
				while(rs.next()) {
					Integer id =rs.getInt("id");
					String bookcategories = rs.getString("categories");
					String booktitle = rs.getString("title");
					String authorname = rs.getString("name");
					Integer price = rs.getInt("price");
					//create object for entire items
					Bookitems bookitemsobj = new Bookitems();
					bookitemsobj.setBookcategories(bookcategories);
					bookitemsobj.setBookauthor(authorname);
					bookitemsobj.setBooktitle(booktitle);
					bookitemsobj.setPrice(0);
				
					//store row details in list
					BookitemsList1.add(bookitemsobj);
				}	
				return BookitemsList1;
				}
		 
	
				
		     
	//2-method  update items
	public void updateBookitems(Bookitems bookitems) throws Exception {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		// 1.Get connection
		connection = ConnectionUtil.getConnection();

		// 2. Prepare the query
		String sql = "update Bookitems set authorname =? where id = ?";
		statement = connection.prepareStatement(sql);
       statement.setString(1,"harrypotter");
       statement.setInt(2, 3);
		// 3.execute query
		int rows = statement.executeUpdate();
	System.out.println("No of rows updated:" + rows);
	
		}
	
		//3rd method-delete items	
public void deleteBookitems(int id) throws Exception {
	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet rs = null;

	// 1.Get connection
	connection = ConnectionUtil.getConnection();

	// 2. Prepare the query
	String sql = "delete from bookitems where id = ?" ;
	statement = connection.prepareStatement(sql);
	statement.setInt(1,id);

	// 3.execute query
	int rows = statement.executeUpdate();
	System.out.println("No of rows deleted :" + rows);
}

  //4th method=findall
 List<Bookitems> findAll1() throws Exception {
	List<Bookitems> BookitemsList = new ArrayList<Bookitems>();
	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet rs = null;
	//get connection
	connection = ConnectionUtil.getConnection();
	//prepare query
	String sql = "Select id,bookcategories,booktitle,authorname,price from Bookitems";
	statement = connection.prepareStatement(sql);
	statement.setString(1,"storybooks");
	//execute the query
	rs = statement.executeQuery();
	//iterate rows
	while(rs.next()) {
		Integer id =rs.getInt("id");
		String bookcategories = rs.getString("categories");
		String booktitle = rs.getString("title");
		String authorname = rs.getString("name");
		Integer price = rs.getInt("price");
		//create object for entire items
		Bookitems bookitemsobj = new Bookitems();
		bookitemsobj.setBookcategories(bookcategories);
		bookitemsobj.setBookauthor(authorname);
		bookitemsobj.setBooktitle(booktitle);
		bookitemsobj.setPrice(0);
		
		//store row details in list
		BookitemsList.add(bookitemsobj);
	}
	return BookitemsList;
}
		
	//5th method-  find by id	
public Bookitems findBy(int id) throws Exception {
	Bookitems bookitemsObj  = null;
	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet rs = null;

	// 1.Get connection
	connection = ConnectionUtil.getConnection();

	// 2. Prepare the query
	String sql = "select id,titlename ,authorname from Bookitems where id = ?";
	statement = connection.prepareStatement(sql);
	statement.setString(1, "death");

	// 3.execute query
	rs = statement.executeQuery();

	// 4. Iterate rows
	if (rs.next()) {
		Integer id1 = rs.getInt("id");
		String titlename= rs.getString("name");
		String authorname = rs.getString("authorname");

		// 1 row details => stored in 1 model object
    	Bookitems bookitemsObj1 = new Bookitems();
    	bookitemsObj1.setBooktitle(titlename);
    	bookitemsObj1.setBookauthor(authorname);
	}
return bookitemsObj;
}
  //6th method- find by authorname
public List<Bookitems> findByauthorName(String authorname) throws Exception {
	List<Bookitems> bookitemsList = new ArrayList<Bookitems>();
Connection connection = null;
	PreparedStatement statement = null;
	ResultSet rs = null;
// 1.Get connection
	connection = ConnectionUtil.getConnection();
// 2. Prepare the query
	String sql = "select id,authorname,titlename  where authorname = ?";
	statement = connection.prepareStatement(sql);
	statement.setString(1, authorname);		

	// 3.execute query
	rs = statement.executeQuery();

	// 4. Iterate rows
	while (rs.next()) {
		Integer id = rs.getInt("id");
		String authorname1 = rs.getString("name");
		String titlename = rs.getString("title");

		// 1 row details => stored in 1 model object
		Bookitems bookitemsobj = new Bookitems();
		bookitemsobj.setBookauthor(authorname);
		bookitemsobj.setBooktitle(titlename);

		// store the row details in a list
		bookitemsList.add(bookitemsobj);

	}
	return bookitemsList;
}
     //7th method-count bookitems
public int count() throws Exception {
	Integer count = null;
	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet rs = null;

	// 1.Get connection
	connection = ConnectionUtil.getConnection();

	// 2. Prepare the query
	String sql = "select count(*) as cnt from bookitemss";
	statement = connection.prepareStatement(sql);
	// input

	// 3.execute query
	rs = statement.executeQuery();

	// 4. Iterate rows
	if (rs.next()) {
		count = rs.getInt("cnt");
	}

	return count;
	}

  //8th method-search by titlename

public Bookitems findBytitleName(int titlename) throws Exception {
	Bookitems bookitemsObj  = null;
	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet rs = null;
	
	// 1.Get connection
		connection = ConnectionUtil.getConnection();

		// 2. Prepare the query
		String sql = "select id,titlename ,authorname from Bookitems where titlename = ?";
		statement = connection.prepareStatement(sql);
		statement.setString(1, "death");

		// 3.execute query
		rs = statement.executeQuery();

		// 4. Iterate rows
		if (rs.next()) {
			Integer id1 = rs.getInt("id");
			String titlename1= rs.getString("name");
			String authorname = rs.getString("authorname");

			// 1 row details => stored in 1 model object
	    	Bookitems bookitemsObj1 = new Bookitems();
	    	bookitemsObj1.setBooktitle(titlename1);
	    	bookitemsObj1.setBookauthor(authorname);
		}
	return bookitemsObj;
	}
   
//9th method-find by categories

public List<Bookitems> findByCategories(String categoriesname) throws Exception {
	List<Bookitems> BookitemsList = new ArrayList<Bookitems>();
 Connection connection = null;
	PreparedStatement statement = null;
	ResultSet rs = null;

	// 1.Get connection
	connection = ConnectionUtil.getConnection();
// 2. Prepare the query
	String sql = "select id,bookcategories,authorname  where name = ?";
	statement = connection.prepareStatement(sql);
	statement.setString(1, categoriesname);
    // 3.execute query
	rs = statement.executeQuery();
// 4. Iterate rows
	while (rs.next()) {
		Integer id = rs.getInt("id");
		String name = rs.getString("categories name");
	
		// 1 row details => stored in 1 model object
		Bookitems bookitemsobj = new Bookitems();
		bookitemsobj.setBookcategories(categoriesname);
		bookitemsobj.setBookauthor(name);

		// store the row details in a list
		BookitemsList.add(bookitemsobj);
		}
return BookitemsList;

}




public void addBookitems(Bookitems bookitems) throws Exception {
	// TODO Auto-generated method stub
	
}




public List<Bookitems> findAll() throws Exception {
	// TODO Auto-generated method stub
	return null;
}

	}











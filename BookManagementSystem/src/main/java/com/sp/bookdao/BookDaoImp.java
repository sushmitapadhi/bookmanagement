/**
 * 
 */
package com.sp.bookdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.sp.DBConnector.DBConnector;
import com.sp.bookmodel.Book;




/**
 * @author sushmita padhi
 *
 */
@Service
public class BookDaoImp implements BookDao  {
	
	Connection con;
	Book b;
	
	public BookDaoImp()
	{
		b= new Book(1,"abc","xyz");
		b= new Book(2,"one Indian Girl","Chetan Bhagat");
		
	}

	@Override
	public void createBook(Book book) {
		// TODO Auto-generated method stub
	try
	{
		con=(Connection) DBConnector.getConnection();
		PreparedStatement pst=(PreparedStatement) con.prepareStatement("insert into book values(?,?,?)"); 
		
		
		pst.setString(1, b.getTitle());
		pst.setString(2, b.getAuthor());
		
		pst.execute();
		System.out.println("inserted successfully");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		
	}

	@Override
	public List<Book> showAll() {
		// TODO Auto-generated method stub
		try
		{
			con=(Connection) DBConnector.getConnection();
			Statement st= (Statement ) con.createStatement();
			ResultSet rs=st.executeQuery("select from Book");
			List<Book> list= new ArrayList<Book>();
			while(rs.next())
			{
				Book b1=new Book();
				
				b1.setTitle(rs.getString(1));
				b1.setAuthor(rs.getString(2));
				
			}
			return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return showAll();
		
	}
}




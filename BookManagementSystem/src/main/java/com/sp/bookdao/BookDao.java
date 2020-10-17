/**
 * 
 */
package com.sp.bookdao;

import java.util.List;

import com.sp.bookmodel.Book;

/**
 * @author sushmita padhi
 *
 */
public interface BookDao {

	public void createBook(Book book);

	public List<Book> showAll();
	
}

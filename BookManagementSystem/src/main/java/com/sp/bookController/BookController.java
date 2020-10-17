/**
 * 
 */
package com.sp.bookController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sp.bookdao.BookDao;
import com.sp.bookmodel.Book;


/**
 * @author sushmita padhi
 *
 */
@RestController
@RequestMapping(value="/book")
public class BookController {
	
	@Autowired
	BookDao bd;
	
	@RequestMapping(value="/all")
	public List<Book>insertBook(Book book)
	{
		
		System.out.println("in controller");
		bd.createBook(book);
		return bd.showAll();
		
	}
}
	
	



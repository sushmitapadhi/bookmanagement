/**
 * 
 */
package com.sp.bookmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author sushmita padhi
 *
 */
@Entity
@Table(name = "book")
public class Book {
	
	
	@Id
	@Column(name = "id")
	 int id;
	
	@Column(name = "title")
	 String title;
	
	@Column(name = "author")
	 String author;
	
	

	public Book(int id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}
	public Book() {
		super();
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
	
}



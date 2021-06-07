package com.collectionsPractice.model;

public class Book implements Comparable<Book> {
	private int id;
	private String bookName;
	private String author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String bookName, String author) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author + "]";
	}
	@Override
	public int compareTo(Book b) {
		if(this.getBookName().compareTo(b.getBookName())>0) {
			return 1;
			
		}
		else if(this.getBookName().compareTo(b.getBookName())==0){
			if(this.getAuthor().compareTo(b.getAuthor())>0) {
				return 1;
				
			}
			else {
				return -1;
			}
			
			
		}
		else {
			return -1;
			
		}
	
	}
}

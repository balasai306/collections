package com.collectionsPractice.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.collectionsPractice.model.Book;

public class Operations {
	public List<Book> inputData() {
		System.out.println("please enter the list values");
		System.out.println("enter id of book");
		System.out.println("enter name of book");
		System.out.println("enter author of book");

		List<Book> books = new ArrayList<Book>();
		// simply hard coding values
		Book b = new Book();
		b.setId(1);
		b.setBookName("abc");
		b.setAuthor("efg");
		books.add(b);
		Book b2 = new Book();
		b2.setId(1);
		b2.setBookName("abc");
		b2.setAuthor("efg");
		books.add(b2);
		Book b3 = new Book();
		b3.setId(3);
		b3.setBookName("bbc1");
		b3.setAuthor("author");
		books.add(b3);
		Book b4 = new Book();
		b4.setId(4);
		b4.setBookName("book3");
		b4.setAuthor("xyz");
		books.add(b4);
		Book b5 = new Book();
		b5.setId(5);
		b5.setBookName("book3");
		b5.setAuthor("axyz");
		books.add(b5);
		return books;

	}

	public HashMap<Integer, List<Book>> addListToMap(List<Book> books) {
		HashMap<Integer, List<Book>> bookMap = new HashMap<Integer, List<Book>>();
		bookMap.put(1, books);
		return bookMap;

	}

	public HashMap<Integer, Book> listDataToMap(List<Book> books) {
		HashMap<Integer, Book> bookMap = new HashMap<Integer, Book>();
		// inserting list values into map to filter dupes
		for (Book book : books) {
			int i = book.getId();
			if (!bookMap.containsKey(i)) {
				bookMap.put(i, book);

			}
		}
		System.out.println(bookMap);
		System.out.println("****************Printing map values*********************");
		for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
			System.out.println("key = " + entry.getKey());
			System.out.println("Value = " + entry.getValue());
		}

		return bookMap;

	}

//	public void addMapToSet() {
//
//	}

	public void listDataTOSet(List<Book> books) {
		HashSet<Book> bookSet = new HashSet<Book>();
		System.out.println("set data");

		for (Book book : books) {
			bookSet.add(book);
		}

		System.out.println("set is " + bookSet);
		Iterator<Book> itr = bookSet.iterator();
		
	}



	public List<Book> sortComparable(List<Book> books) {
		// using Comparable
		System.out.println("using comparable to sort");
		Collections.sort(books);
		return books;

	}

	public List<Book> sortList(List<Book> books) {
		Collections.sort(books, new Comparator<Book>() {
// uising Comparator
			@Override
			public int compare(Book b1, Book b2) {
				// TODO Auto-generated method stub
				if (b1.getBookName().compareTo(b2.getBookName()) > 0) {
					return 1;

				} else if (b1.getBookName().compareTo(b2.getBookName()) == 0) {
					if (b1.getAuthor().compareTo(b2.getAuthor()) > 0) {
						return 1;

					} else {
						return -1;
					}

				} else {
					return -1;

				}

			}

		});

		return books;

	}

	public void dispList(List<Book> books) {
//		List<Book> sortedBooks=	sortList(books);
//		System.out.println(" using Comparator");
//		for (Book book : sortedBooks) {
//			System.out.println(book);
//			
//		}
		List<Book> sortedBooks1 = sortComparable(books);
		System.out.println(" using Comparable");
		for (Book book : sortedBooks1) {
			System.out.println(book);

		}

	}

	public void dispMap(HashMap<Integer, List<Book>> bookMap) {
		System.out.println("Printing map of lists");
		for (Map.Entry<Integer, List<Book>> entry : bookMap.entrySet()) {
			System.out.println("key = " + entry.getKey());
			System.out.println("Value = " + entry.getValue());
		}

	}

	public void dispSet() {

	}
}

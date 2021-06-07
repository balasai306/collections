package com.collectionsPractice.client;

import java.util.HashMap;
import java.util.List;

import com.collectionsPractice.model.Book;
import com.collectionsPractice.service.Operations;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations op = new Operations();
		List<Book> books = op.inputData();
		System.out.println("displaying list");
		op.dispList(books);
		HashMap<Integer, List<Book>> bookMap = op.addListToMap(books);
		op.dispMap(bookMap);
		op.listDataToMap(books);
		op.listDataTOSet(books);
	}

}

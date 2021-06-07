package com.collectionsPractice.client;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.collectionsPractice.model.Book;
import com.collectionsPractice.service.Operations;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations op = new Operations();
		List<Book> books = op.inputData();
		System.out.println("displaying list");
		Scanner scan = new Scanner(System.in);
		
		HashMap<Integer, List<Book>> bookMap = op.addListToMap(books);
		
		
		

		int key = 0;
		boolean flag = true;
		do {
			System.out.println("*********press the key for action**********************************");
			System.out.println("*********press 1 for listdata*******************************");
			System.out.println("*********press 2 for list in map data*******************************");
			System.out.println("*********press 3 map****************");
			System.out.println("*********press 4 set*********************");
			System.out.println("*********press 5 for exit******************************************");
			key = scan.nextInt();
			switch (key) {
			case 1:
				op.dispList(books);
				break;
			case 2:
				op.dispMap(bookMap);
				break;
			case 3:
				op.listDataToMap(books);
				break;
			case 4:
				op.listDataTOSet(books);
				break;
			case 5:
				flag=false;
				System.out.println("you have exited");
				break;
			default:
				System.out.println("you have entered a worng value");
				break;
			}

		} while (flag);
//		int key = 0;
//		boolean flag = true;
//		do {
//			System.out.println("*********press the key for action**********************************");
//			System.out.println("*********press 1 for add new product*******************************");
//			System.out.println("*********press 2 for update quantity*******************************");
//			System.out.println("*********press 3 for display based on user quantity****************");
//			System.out.println("*********press 4 for display based on quantity*********************");
//			System.out.println("*********press 5 for Delete particular product from inventory******");
//			System.out.println("*********press 6 for exit******************************************");
//			key = scan.myScan().nextInt();
//
//			switch (key) {
//			case 1:
//
//				dataManuplation.addProduct();
//				break;
//			case 2:
//				System.out.println("Enter id and quantity");
//				dataManuplation.updateProduct();
//				break;
//			case 3:
//				System.out.println("3 display based on user entered quantity");
//				dataManuplation.customDisplayProduct();
//				break;
//			case 4:
//				System.out.println("4 displaying on based quantity");
//				dataManuplation.displayProduct();
//				break;
//			case 5:
//				dataManuplation.deleteProduct();
//				break;
//			case 6:
//				flag = false;
//				System.out.println("you have exited");
//				break;
//
//			default:
//				System.out.println("you have entered a worng value");
//				break;
//			}
//
//		} while (flag);
//		
	}

}

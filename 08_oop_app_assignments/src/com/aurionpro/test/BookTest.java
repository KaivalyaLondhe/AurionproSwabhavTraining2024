package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Book;

public class BookTest {
	static Scanner scanner = new Scanner(System.in);

	private static void bookCreation(int numberOfBooks, Book[] books) {

		for (int i = 0; i < numberOfBooks; i++) {
			System.out.print("Please enter Book ID: ");
			int bookId = scanner.nextInt();
			System.out.print("Please enter Book name: ");
			String bookName = scanner.next();
			System.out.print("Please enter Author name: ");
			String authorName = scanner.next();
			System.out.print("Please enter price of the book: ");
			int price = scanner.nextInt();

			books[i] = new Book(bookId, bookName, authorName, price);
			System.out.println("Book added successfully");
		}

	}

	private static void display(Book[] books) {
		for (int i = 0; i < books.length; i++) {
			for (int j = 0; j < books.length - i - 1; j++) {
				if (books[j].getPrice() < books[j + 1].getPrice()) {
					Book temp = books[j];
					books[j] = books[j + 1];
					books[j + 1] = temp;
				}
			}
		}
		for (Book book : books) {
			System.out.println("Book Name: " + book.getBookName() + "\t Price: " + book.getPrice());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of books you wish to add: ");

		int numberOfBooks = scanner.nextInt();
		Book books[] = new Book[numberOfBooks];
		bookCreation(numberOfBooks, books);
		System.out.println("The books in descending order according to their prices are as follows: ");
		display(books);
	}

}

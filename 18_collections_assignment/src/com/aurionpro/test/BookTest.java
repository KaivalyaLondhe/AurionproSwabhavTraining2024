package com.aurionpro.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.Book;
import com.aurionpro.model.BookComparator;

public class BookTest {

	static Scanner scanner = new Scanner(System.in);
	static int bookCounter = 1;

	private static void addBooks(List<Book> books) {
		System.out.print("Please enter Title for Book " + bookCounter + ":   ");
		String title = scanner.next();
		System.out.println("");
		System.out.print("Please enter the Price of the Book:   ");
		double price = scanner.nextDouble();
		System.out.println("");
		System.out.print("Please enter Author's Name for Book:   ");
		String authorName = scanner.next();
		System.out.println("");
		System.out.print("Please enter the Publication Year of the Book:   ");
		int publicationYear = scanner.nextInt();
		books.add(new Book(title, authorName, price, publicationYear));
		addMoreBooks(books);

	}

	private static void addMoreBooks(List<Book> books) {
		System.out.println(
				"Do you want to add more books? \n 1. Add new book \n 2. Continue with the existing collection \n 3. Exit");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			addBooks(books);
			break;
		case 2:
			displayBooksChoice(books);
			break;
		case 3:
			System.out.println("Thank you for using our services!");
			System.exit(0);
		}
	}

	private static void displayBooksChoice(List<Book> books) {
		System.out.println(
				"How would you like your books to be sorted?" + " \n 1. Unsorted \t 2. Title \t 3. Author \t 4. Price "
						+ "\n 5. Publication Year \t 6. First by Author then by Title then by Price "
						+ "\n 7. First by Publication Year then by Price then by Author \t 8. Exit");

		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			for (Book book : books)
				System.out.println(book);
			System.out.println("");
			displayBooksChoice(books);
			break;
		case 2:
			Collections.sort(books, new BookComparator.BookTitleComparator());
			for (Book book : books)
				System.out.println(book);
			System.out.println("");
			displayBooksChoice(books);
			break;
		case 3:
			Collections.sort(books, new BookComparator.BookAuthorComparator());
			for (Book book : books)
				System.out.println(book);
			System.out.println("");
			displayBooksChoice(books);
			break;
		case 4:
			Collections.sort(books, new BookComparator.BookPriceComparator());
			for (Book book : books)
				System.out.println(book);
			System.out.println("");
			displayBooksChoice(books);
			break;
		case 5:
			Collections.sort(books, new BookComparator.BookPublicationYearComparator());
			for (Book book : books)
				System.out.println(book);
			System.out.println("");
			displayBooksChoice(books);
			break;
		case 6:
			Collections.sort(books, new BookComparator.BookAuthorComparator().thenComparing(
					new BookComparator.BookTitleComparator().thenComparing(new BookComparator.BookPriceComparator())));
			for (Book book : books)
				System.out.println(book);
			System.out.println("");
			displayBooksChoice(books);
			break;
		case 7:
			Collections.sort(books, new BookComparator.BookPublicationYearComparator().thenComparing(
					new BookComparator.BookPriceComparator().thenComparing(new BookComparator.BookAuthorComparator())));
			for (Book book : books)
				System.out.println(book);
			System.out.println("");
			displayBooksChoice(books);
			break;
		case 8:
			System.out.println("Thank you for using our services!");
			System.exit(0);
		default:
			System.out.println("Please enter a valid input!!!");
			System.out.println("");
			displayBooksChoice(books);
			break;
		}
	}

	private static void mainMenu(List<Book> books) {
		System.out.println("--------------- Welcome To Book Library ---------------");
		System.out.println("What would you like to do today? \n 1. Add Books \n 2. Display Books \n 3. Exit");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			addBooks(books);
			break;
		case 2:
			if (books.size() == 0) {
				System.out.println("Currently the list is empty please add books first!");
				addBooks(books);
				return;
			}
			displayBooksChoice(books);
			break;
		case 3:
			System.out.println("Thank you for using our services!");
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		List<Book> books = new LinkedList<Book>();
		mainMenu(books);
	}

}

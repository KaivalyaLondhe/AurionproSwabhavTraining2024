package com.aurionpro.model;

import java.util.Comparator;

public class BookComparator {
	
	public static class BookTitleComparator implements Comparator<Book>{

		@Override
		public int compare(Book book1, Book book2) {
			
			return book1.getTitle().compareToIgnoreCase(book2.getTitle());
		}
		
	}
	public static class BookAuthorComparator implements Comparator<Book>{

		@Override
		public int compare(Book book1, Book book2) {
			
			return book1.getAuthor().compareToIgnoreCase(book2.getAuthor());
		}
		
	}
	public static class BookPriceComparator implements Comparator<Book>{

		@Override
		public int compare(Book book1, Book book2) {
			
			return (int) (book1.getPrice()-book2.getPrice());
		}
		
	}
	public static class BookPublicationYearComparator implements Comparator<Book>{

		@Override
		public int compare(Book book1, Book book2) {
			
			return book1.getPublicationYear()-book2.getPublicationYear();
		}
		
	}
}

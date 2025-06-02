package LibrarySystem;
import java.util.ArrayList;
import java.util.List;

import LibrarySystem.exceptions.BookNotAvailableException;

public class Library {
//attributes
	private List<Book> books;
	private List<User> users;
//constructors
	public Library(){
		this.books = new ArrayList<>();
		this.users = new ArrayList<>();
	}
//book managements
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Added Book: " + book.getTitle());
	}
	
	public Book findBookbyTitle(String title) {
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				return book;
				}
		}
		return null;
	}
	
	public Book findBookByISBN(String isbn) {
		for (Book book : books) {
			if (book.getIsbn().equals(isbn)) {
				return book;
			}
		}
		return null;
	}
	
//users managements
	public void addUser(User user) {
		users.add(user);
		System.out.println("Add user: " + user.getName());
	}
	
	public User findUserById(String Id) {
		for (User user : users) {
			if (user.getUserId().equals(Id)) {
				return user;
			}
		}
		return null;
	}
	
//Borrow and return books
	
	public void borrowBook(String UserId, String isbn) throws BookNotAvailableException {
		User user = findUserById(UserId);
		Book book = findBookByISBN(isbn);
		if (user == null || book == null) {
			System.out.println("User or book is not found.");
			return;
		}
		if (book instanceof RegularBook) {
			RegularBook rb = (RegularBook) book;
			
			if(!rb.isAvaliable()) {
				throw new BookNotAvailableException("This book is not available.");
			}
			user.borrowBook(book);
			rb.borrow();
		}
		else {System.out.println("This book is reference only and cannot be borrowed");
		}
		
	}
	public void returnBook(String UserId, String isbn) {
		User user = findUserById(UserId);
		Book book = findBookByISBN(isbn);
		if (user == null || book == null) {
			System.out.println("User or Book not found.");
			return;
		}
		if (!user.getBorrowedBooks().contains(book)) {
			System.out.println("User did not borrow this book.");
			return;
		}
		user.returnBook(book);
		
		if (book instanceof RegularBook) {
			((RegularBook) book).returnBook();
		}
	}
	
	public void showAllBooks() {
		System.out.println("----All Books----");
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	public void showAllUsers() {
		System.out.println("----All Users----");
		for (User user :users) {
			System.out.println(user);
		}
	}
}

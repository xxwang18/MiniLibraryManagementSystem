package LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class User {
//attributes
private String Name;
private String userId;
// A list to store borrowed book
private List<Book> borrowedBooks;

public User(String name, String userId) {
	this.Name = name;
	this.userId = userId;
	this.borrowedBooks = new ArrayList<>(); //initialized the book list
}

// Add a book to the borrowed list
public void borrowBook(Book book) {
	borrowedBooks.add(book);
}

//Return a book
public void returnBook(Book book) {
	borrowedBooks.remove(book);
}

//Get all borrowed books
public List<Book> getBorrowedBooks(){
	return borrowedBooks;
}
//Getters for name and ID
public String getName() {
	return Name;
}
public String getUserId() {
	return userId;
}
public String toString() {
	return "User Name: "+ Name + " User Id: " + userId;
}
}

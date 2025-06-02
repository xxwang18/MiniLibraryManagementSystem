package LibrarySystem;

public class Book {
//attributes	
protected String title;
protected String author;
protected String isbn;
protected int quantity;

//Constructors
public Book(String title, String author, String isbn, int quantity) {
	this.title = title;
	this.author = author;
	this.isbn = isbn;
	this.quantity = quantity;
}

//Getters
public String getTitle() {
	return title;
}
public String getAuthor() {
	return author;
}
public String getIsbn() {
	return isbn;
}
public int getQuantity() {
	return quantity;
}
//Setters
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public String toString() {
	return "Title: "+ title + ",Author "+ author + ",ISBN: "+isbn + ",Available:" + quantity;
}
}

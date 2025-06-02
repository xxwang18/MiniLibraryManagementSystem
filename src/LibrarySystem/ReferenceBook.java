package LibrarySystem;

public class ReferenceBook extends Book {
	public ReferenceBook(String title,String author,String isbn) {
		super(title,author,isbn,1); //usually one copy
	}
	@Override
	public String toString() {
		return "[Reference Only]" + super.toString();
	}
}

package LibrarySystem;

public class RegularBook extends Book implements Borrowable{
	public RegularBook(String title, String author,String isbn, int quantity) {
		super(title,author,isbn,quantity);
	}
	
	@Override
	public void borrow() {
		if (quantity>0) {
			quantity--;
			System.out.println("You borrowed:" + title);
		}
		else {
			System.out.println("Sorry, no copies of "+title+" are available.");
		}
	}
	@Override
	public void returnBook() {
		quantity++;
		System.out.println("You returned: "+title);
	}
	@Override
	public boolean isAvaliable() {
		return quantity>0;
	}
}

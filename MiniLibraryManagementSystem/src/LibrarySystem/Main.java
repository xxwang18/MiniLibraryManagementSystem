package LibrarySystem;

public class Main {
	public static void main(String[] args) throws Exception{
		Book book1 = new Book("1984", "George Orwell", "9780451524935", 3);
		System.out.println(book1.toString());
		
		User xiong = new User("xiong","wxx");
		System.out.println(xiong.getName());
		System.out.println(xiong.getUserId());
		
		RegularBook rbook =new RegularBook("1984", "George Orwell", "9780451524935", 3);
		System.out.println("Now you borrowed one book");
		rbook.borrow();
		System.out.println("The rest number of the book: "+rbook.getTitle()+" is " +rbook.getQuantity());
		//Reference book, not borrowable
		ReferenceBook rfbook = new ReferenceBook("Romance of three kingdoms","Luo,Guanzhong","8939282");
		System.out.println(rfbook.toString());
		
		Library library = new Library();
		
		//add books
		library.addBook(rfbook);
		library.addBook(rbook);
        library.addBook(new RegularBook("Java Basics", "Alice", "123", 3));
        library.addBook(new RegularBook("Oxford Dictionary", "Oxford", "999",1));
        //add users
        library.addUser(xiong);
        library.addUser(new User("Jeakyoung","123124"));
        
        library.showAllBooks();
        library.showAllUsers();
        
        library.borrowBook(xiong.getUserId(),rbook.getIsbn());

        System.out.println("The quantity of book: "+rbook.getQuantity());
        System.out.println(rbook.isAvaliable());
	}

}


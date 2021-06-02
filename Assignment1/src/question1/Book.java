package question1;

public class Book {
	int isbn;
	String name;
	String author;
	double price;
	int copies;
	
	public Book(int isbn, String name, String author, double price, int copies) {
		super();
		this.isbn= isbn;
		this.name=name;
		this.author =author;
		this.price=price;
		this.copies=copies;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

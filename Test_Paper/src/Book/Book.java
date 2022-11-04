/**
* @Developer : Sagar_Pokale
* 03-Nov-2022 10:54:39 PM
**/

package Book;

public class Book {
	private String name;
	private String author;
	private int pages;
	private double price;

	public Book(String name, String author, int pages2, double price2) {
		this.name = name;
		this.author = author;
		this.pages = pages2;
		this.price = price2;
	}

	public Book() {
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

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", pages=" + pages + ", price=" + price + "]";
	}

}

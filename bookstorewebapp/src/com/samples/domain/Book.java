package com.samples.domain;

public class Book {
	
	private Long id;
	private String isbn;
	private String name;
	private int price;
	
	public Book() {}
	
	public Book(Long id, String isbn, String name, int price) {
		this.id = id;
		this.isbn = isbn;
		this.name = name;
		this.price = price;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", name=" + name + ", price=" + price + "]";
	}
	
}

}

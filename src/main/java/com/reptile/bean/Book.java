package com.reptile.bean;

/**
 * @author LiuEnYuan
 * @version 1.1 封装了京东书籍数据的 Book Model
 **/
public class Book {

	private String bookId;
	private String bookName;
	private String bookPrice;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String bookId, String bookName, String bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}

}

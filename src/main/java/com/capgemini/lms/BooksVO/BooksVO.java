package com.capgemini.lms.BooksVO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = {"Book_Id"})
public class BooksVO {

	private int Book_Id;
	private String author;
	private String title;
	private String price;
	private String isavailable;
	private String pub_Id;
	public int getBook_Id() {
		return Book_Id;
	}
	public void setBook_Id(int book_Id) {
		Book_Id = book_Id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getIsavailable() {
		return isavailable;
	}
	public void setIsavailable(String isavailable) {
		this.isavailable = isavailable;
	}
	public String getPub_Id() {
		return pub_Id;
	}
	public void setPub_Id(String pub_Id) {
		this.pub_Id = pub_Id;
	}
	
	
}
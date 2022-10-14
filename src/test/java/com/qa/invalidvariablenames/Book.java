package com.qa.invalidvariablenames;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
	
	/*  in valid name
	 * {
			"book name" : "Data Structure",
  			"author name" : "Mark Hendery"
  
		}
	
	  */
	@JsonProperty("book name")
	private String bookName ;
	@JsonProperty("author name")
	private String authorName;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

}

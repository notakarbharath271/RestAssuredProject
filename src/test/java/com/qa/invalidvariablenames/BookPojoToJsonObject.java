package com.qa.invalidvariablenames;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BookPojoToJsonObject {

	public static void main(String[] args) throws JsonProcessingException {
		
		Book book = new Book();
		book.setBookName("Data Structure");
		book.setAuthorName("Mark Hendry");
		
		ObjectMapper om = new ObjectMapper();
		String bookjson = om.writerWithDefaultPrettyPrinter().writeValueAsString(book);
		
		System.out.println(bookjson);

	}

}

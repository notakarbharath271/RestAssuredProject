package com.qa.restassured.pojojackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PojoTest {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		ObjectMapper objectmapper = new ObjectMapper();

		AddressPojoClass address = objectmapper.readValue(
				new File("C:\\Users\\bhara\\eclipse-workspace\\RestAssuredDemo\\Payload\\address.json"),
				AddressPojoClass.class);
		System.out.println(address.getState());
		System.out.println(address.getDoorno());

		address.setDoorno("12-10");
		System.out.println(address.getDoorno());
		
		String jsonString = objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);
		System.out.println(jsonString);

	}

}

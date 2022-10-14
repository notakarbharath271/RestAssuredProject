package com.api.restAssured;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class EmployeePojoClass {
	
	public static void main(String[] args) {
		
		EmployeeDetails empdetails = new EmployeeDetails("Bharath", "Tester", new String[] {"java","Selenium"}, "XYZ","Bharath@xyz.com");
		
		Response postresponse = given()
									.auth()
									.none()
									.header("Content-Type","application/json")
									.contentType(ContentType.JSON)
							.when()
									.body(empdetails)
									.post("https://reqres.in/api/users");

		postresponse.prettyPrint();
		
	}
	
	
}

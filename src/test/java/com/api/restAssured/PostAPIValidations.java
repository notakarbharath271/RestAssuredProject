package com.api.restAssured;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostAPIValidations {

	public static void main(String[] args) {
		
		HashMap<String, Object> hmap = new HashMap<String, Object>();

		hmap.put("name", "Bharath");
		hmap.put("job", "Tester");

		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Selemiun");
		al.add("RestAssured");

		hmap.put("skills", al);

		HashMap<String, Object> dethmap = new HashMap<String, Object>();
		dethmap.put("companyname", "XYZ");
		dethmap.put("emailid", "bharath@xyz.com");

		hmap.put("details", dethmap);

		Response postresponse = given().auth().none().header("Content-Type", "application/json")
				.contentType(ContentType.JSON).when().body(hmap).post("https://reqres.in/api/users");

		postresponse.prettyPrint();
		
		System.out.println("Status code is : "+postresponse.statusCode());
		System.out.println("name is : "+postresponse.getBody().path("name"));
		System.out.println("job is : "+postresponse.getBody().path("job"));
		System.out.println("skill 0 is : "+postresponse.getBody().path("skills[0]"));
		System.out.println("skill 1 is : "+postresponse.getBody().path("skills[1]"));
		System.out.println("skill 2 is : "+postresponse.getBody().path("skills[2]"));
		System.out.println("skill 3 is : "+postresponse.getBody().path("skills[3]"));
		System.out.println("company name is : "+postresponse.getBody().path("details.companyname"));
		System.out.println("emailid is : "+postresponse.getBody().path("details.emailid"));
		


	}

}

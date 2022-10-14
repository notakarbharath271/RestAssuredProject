package com.api.restAssured;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostAPIRuntimeUsingHashMap {

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
		dethmap.put("companyname", "YXZ");
		dethmap.put("emailid", "bharath@xyz.com");

		hmap.put("details", dethmap);

		Response postresponse = given().auth().none().header("Content-Type", "application/json")
				.contentType(ContentType.JSON).when().body(hmap).post("https://reqres.in/api/users");

		postresponse.prettyPrint();

	}

}

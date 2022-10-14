package com.api.restAssured;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JsonAPIClass {
	
	public static void main(String[] args) {
		
		JSONObject jo = new JSONObject();
		
		jo.put("name", "Sarath");
		jo.put("job", "WebDeveloper");
		
		JSONArray ja = new JSONArray();
		
		ja.put("JAVA");
		ja.put("PYTHON");
		
		jo.put("skills", ja);
		
		JSONObject jo1 = new JSONObject();
		
		jo1.put("companyname", "ABC");
		jo1.put("emailid", "sarath@abc.com");
		
		jo.put("details", jo1);
		
		
		Response postresponse = given().auth().none().header("Content-Type", "application/json")
				.contentType(ContentType.JSON).when().body(jo.toString()).post("https://reqres.in/api/users");

		postresponse.prettyPrint();
		
		
		
		
		
	}
	

}

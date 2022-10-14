package restfullbooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PrintResponsebodyusingtiString {

	public static void main(String[] args) {
		String responsebody = RestAssured
		.given()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking")
		.body("{\r\n"
			+ "    \"firstname\" : \"Bhara\",\r\n"
			+ "    \"lastname\" : \"Kuma\",\r\n"
			+ "    \"totalprice\" : 122,\r\n"
			+ "    \"depositpaid\" : true,\r\n"
			+ "    \"bookingdates\" : {\r\n"
			+ "        \"checkin\" : \"2022-03-01\",\r\n"
			+ "        \"checkout\" : \"2022-08-18\"\r\n"
			+ "    },\r\n"
			+ "    \"additionalneeds\" : \"breakfast\"\r\n"
			+ "}")
		.contentType(ContentType.JSON)
	//Hit the request
		.post()
		.then()
		.extract()
		.body()
		.asPrettyString();
		//.asString()
	
		System.out.println(responsebody);
		

	}
}



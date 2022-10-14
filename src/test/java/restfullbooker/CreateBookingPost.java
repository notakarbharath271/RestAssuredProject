package restfullbooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateBookingPost {

	public static void main(String[] args) {
		//Build Request
		RequestSpecification requestspecification = RestAssured.given();
		requestspecification=requestspecification.log().all();
		requestspecification.baseUri("https://restful-booker.herokuapp.com/");
		requestspecification.basePath("booking");
		
		requestspecification.body("{\r\n"
				+ "    \"firstname\" : \"Jim\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2022-03-01\",\r\n"
				+ "        \"checkout\" : \"2022-08-18\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"breakfast\"\r\n"
				+ "}");
		requestspecification.contentType(ContentType.JSON);
		//Hit the request
		Response response = requestspecification.post();
		ValidatableResponse valresponse =  response.then();
		valresponse= valresponse.log().all();
		valresponse.statusCode(200);

	}

}

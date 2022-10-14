package restfullbooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateBookingPostRefactory {

	public static void main(String[] args) {
		//Build Request
		//RequestSpecification requestspecification = RestAssured.given();
		//RestAssured.given().log().all();
		//RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com/");
		//RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com/").basePath("booking");
		
		RestAssured
			.given()
			.log()
			.all()
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
			.log().all()
			.statusCode(200);

	}

}

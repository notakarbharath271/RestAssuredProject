package restfullbooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateBookingPostRefactoryBDD {

	public static void main(String[] args) {
		//Build Request
		
		RestAssured
		.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking")
				.body("{\r\n"
					+ "    \"firstname\" : \"Bhara\",\r\n"
					+ "    \"lastname\" : \"Kuma\",\r\n"
					+ "    \"totalprice\" : 200,\r\n"
					+ "    \"depositpaid\" : false,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2022-03-01\",\r\n"
					+ "        \"checkout\" : \"2022-08-18\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"breakfast\"\r\n"
					+ "}")
				.contentType(ContentType.JSON)
		.when()
				.post()
		.then()
				.log()
				.all()
				.statusCode(200);

	}

}	

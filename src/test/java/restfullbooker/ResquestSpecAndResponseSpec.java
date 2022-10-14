package restfullbooker;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class ResquestSpecAndResponseSpec {
	
	
	
	public static void main(String[] args) {
		
		RequestSpecification requestSpec = RestAssured.given();
				requestSpec.baseUri("https://restful-booker.herokuapp.com/");
				requestSpec.basePath("booking");
				requestSpec.contentType(ContentType.JSON);
		ResponseSpecification responseSpec = RestAssured.expect();
				responseSpec.statusCode(200);
				responseSpec.contentType(ContentType.JSON);
				responseSpec.time(Matchers.lessThan(10000L));
				
		
		RestAssured
			.given()
				.spec(requestSpec)
				.body("{\r\n"
						+ "    \"firstname\" : \"Den\",\r\n"
						+ "    \"lastname\" : \"Mack\",\r\n"
						+ "    \"totalprice\" : 111,\r\n"
						+ "    \"depositpaid\" : true,\r\n"
						+ "    \"bookingdates\" : {\r\n"
						+ "        \"checkin\" : \"2018-01-01\",\r\n"
						+ "        \"checkout\" : \"2019-01-01\"\r\n"
						+ "    },\r\n"
						+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
						+ "}")
				
			.when()
				.post()
			.then()
				.log().all()
				.spec(responseSpec);
				
	}

}

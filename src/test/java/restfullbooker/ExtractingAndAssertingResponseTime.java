package restfullbooker;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class ExtractingAndAssertingResponseTime {

	public static void main(String[] args) {
		
	
		Response response = RestAssured
		.given()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking")
		
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
			.contentType(ContentType.JSON)
		.when()
			.post();
		response.then().time(Matchers.both(Matchers.lessThan(4000L)).and(Matchers.greaterThan(9000L)));
		

	}

}

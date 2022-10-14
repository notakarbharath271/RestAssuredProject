package restfullbooker;

import io.restassured.RestAssured;
	import static org.hamcrest.Matchers.*;

public class GetBookingDetails {

	public static void main(String[] args) {
		RestAssured
					.given()
							.log()
							.all()
							.baseUri("https://restful-booker.herokuapp.com/")
							.basePath("booking/{id}")
							.pathParam("id", 1003)
					.when()
							.get()
					.then()
							.log()
							.all()
							.statusCode(200)
							.body("firstname", equalTo("Howard"),"lastname" , equalTo("Sevilla"));
							
					
	}

}

package restfullbooker;

import  io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;


public class PathParamExample2 {
	public static void main(String[] args) {
		RestAssured
					.given()
							.log()
							.all()
							.baseUri("https://restful-booker.herokuapp.com/")
							.basePath("{basepath}/{bookingid}")
							.pathParam("basepath", "booking")
							.pathParam("bookingid", 1003)
					.when()
							.get()
					.then()
							.log()
							.all()
							.body("depositpaid", equalTo(true));
							
			
	}

}

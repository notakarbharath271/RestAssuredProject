package restfullbooker;

import  io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;


public class PathParamExample {
	public static void main(String[] args) {
		RestAssured
					.given()
							.log()
							.all()
							//.baseUri("https://restful-booker.herokuapp.com/")
							//.basePath("{basepath}/{bookingid}")
							//.pathParam("basepath", "booking")
							//.pathParam("bookingid", 1003)
					.when()
							//in line parameter or unnamed parameter 
							.get("https://restful-booker.herokuapp.com/{basepath}/{bookingid}","booking",1003)
					.then()
							.log()
							.all()
							.body("depositpaid", equalTo(true));
							
			
	}

}

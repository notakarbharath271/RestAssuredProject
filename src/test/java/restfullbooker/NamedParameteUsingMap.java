package restfullbooker;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class NamedParameteUsingMap {

	public static void main(String[] args) {
		Map<String,Object> pathparameters = new HashMap<>();
		
		pathparameters.put("basepath", "booking");
		pathparameters.put("bookingid", 1003);
		
		RestAssured
			.given()
				.log()
				.all()	
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("{basepath}/{bookingid}")
				.pathParams(pathparameters)
			.when()
				.get()
			.then()
				.log()
				.all();

	}

}

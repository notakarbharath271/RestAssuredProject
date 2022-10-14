package restfullbooker;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class InlinePathParamUsingMap {

	public static void main(String[] args) {
		
			Map<String,Object> pathparameters = new HashMap<>();
			
			pathparameters.put("basepath", "booking");
			pathparameters.put("bookingid", 1003);
			
			RestAssured
				.given()
					.log()
					.all()				
				.when()
				.get("https://restful-booker.herokuapp.com/{basepath}/{bookingid}",pathparameters)
				.then()
				.log()
				.all();
		

	}

}

package retryMechanisumUsingAwaitility;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateBooking {

	
	public static int createbooking() {
		
		int randomNumber =(int)((Math.random()*(50-1)+1));
		
		if(randomNumber % 2 == 0) { // Manipulating the api 
			System.out.println("Creating booking-----");
			 return RestAssured
			.given()
			.contentType(ContentType.JSON)
			.body("{\r\n"
					+ "    \"firstname\" : \"Jim\",\r\n"
					+ "    \"lastname\" : \"Brown\",\r\n"
					+ "    \"totalprice\" : 111,\r\n"
					+ "    \"depositpaid\" : true,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2018-01-01\",\r\n"
					+ "        \"checkout\" : \"2019-01-01\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
					+ "}")
			.post()
			.statusCode();
		}
		else
		{
			System.out.println("Creating booking  failed-----");
			return 0;
		}
	}
	

}

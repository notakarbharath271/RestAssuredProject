package restfullbooker;

import io.restassured.RestAssured;

public class DeleteBooking {
	
	public static void main(String[] args) {
		
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("{basepath}/{bookingid}")
				.pathParam("basepath", "booking")
				.pathParam("bookingid", 5940)
				.header("Content-Type","application/json")
				.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
			.when()
				.delete()
			.then()
				.log()
				.all()
				.assertThat()
				.statusCode(201);
			
				
	}

}

package restfullbooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UpdateBookingUsingPatch {

	public static void main(String[] args) {


		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking/103")
			.body("{\r\n"
					+ "    \"firstname\" : \"Bharath\",\r\n"
					+ "    \"lastname\" : \"Kumar\"\r\n"
					+ "}")
			.contentType(ContentType.JSON)
			.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.when()
			.patch()
	    .then()
	    	.log()
	    	.all()
	    	.assertThat()
	    	.statusCode(200);
		

	}

}

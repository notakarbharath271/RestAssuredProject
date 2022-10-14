package restAPIPractice;

import java.util.LinkedHashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecDemo {

	RequestSpecification requestspe;
	ResponseSpecification responsespe;

	@BeforeClass
	public void reqspe() {
		requestspe = RestAssured.given().baseUri("https://restful-booker.herokuapp.com/").basePath("booking")
				.contentType(ContentType.JSON);

	}

	@BeforeClass
	public void resspe() {
		responsespe = RestAssured.expect();
		responsespe.contentType(ContentType.JSON);
		responsespe.statusCode(200);
		responsespe.time(Matchers.lessThan(6000L));
	}

	@Test
	public void postmethod() {

		/*
		 * { "firstname" : "Jim", "lastname" : "Brown", "totalprice" : 111,
		 * "depositpaid" : true, "bookingdates" : { "checkin" : "2018-01-01", "checkout"
		 * : "2019-01-01" }, "additionalneeds" : "Breakfast" }
		 */
		Map<String, Object> finalpayload = new LinkedHashMap<String, Object>();
		finalpayload.put("firstname", "Jim");
		finalpayload.put("lastname", "Brown");
		finalpayload.put("totalprice", "222");
		finalpayload.put("depositpaid", true);

		Map<String, Object> bookdatepayload = new LinkedHashMap<String, Object>();
		bookdatepayload.put("checkin", "2018-01-01");
		bookdatepayload.put("checkout", "2019-01-01");

		finalpayload.put("bookingdates", bookdatepayload);
		finalpayload.put("additionalneeds", "Breakfast");

		RestAssured.given().spec(requestspe).body(finalpayload).log().all().when().post().then().log().all()
				.spec(responsespe);

	}

}

package restAPIPractice;

import java.util.LinkedHashMap;
import java.util.Map;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class UsingBothRequestAndResponseSpec {

	public static void main(String[] args) {
		
		
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
		
		
		RequestSpecification requestspec = RestAssured.given();
		requestspec.baseUri("https://restful-booker.herokuapp.com/");
		requestspec.basePath("booking");
		requestspec.contentType(ContentType.JSON);
		requestspec.body(finalpayload);
		
		ResponseSpecification responseSpe = RestAssured.expect();
		responseSpe.statusCode(200);
		responseSpe.time(Matchers.lessThan(10000l));
		
		RestAssured
			.given(requestspec, responseSpe)
				.post()
				.then().log().all();

	}

}

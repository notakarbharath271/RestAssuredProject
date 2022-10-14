package restAPIPractice;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationsDemo {
	
	RequestSpecification requestspe;
	@BeforeClass
	public void reqspe() {
		requestspe = RestAssured 
		.given()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking")
			.contentType(ContentType.JSON);
		
		
	}
	
	@Test
	public void postmethod() {
		
		/*
		 * {
    "firstname" : "Jim",
    "lastname" : "Brown",
    "totalprice" : 111,
    "depositpaid" : true,
    "bookingdates" : {
        "checkin" : "2018-01-01",
        "checkout" : "2019-01-01"
    },
    "additionalneeds" : "Breakfast"
}*/
		Map<String,Object> finalpayload = new LinkedHashMap<String,Object>();
		finalpayload.put("firstname", "Jim");
		finalpayload.put("lastname", "Brown");
		finalpayload.put("totalprice", "222");
		finalpayload.put("depositpaid", true);
		
		Map<String,Object> bookdatepayload = new LinkedHashMap<String,Object>();
		bookdatepayload.put("checkin", "2018-01-01");
		bookdatepayload.put("checkout", "2019-01-01");
		
		finalpayload.put("bookingdates", bookdatepayload);
		finalpayload.put("additionalneeds", "Breakfast");
		
		
		RestAssured 
			.given()
				.spec(requestspe)
				.body(finalpayload)
				.log().all()
			.when()
				.post()
			.then()
				.log().all();
					
			
		 
	}
	
	@Test
	
	public void updatebooking() {
		
		Map<String,Object> finalpayload2 = new LinkedHashMap<String,Object>();
		finalpayload2.put("firstname", "Jim");
		finalpayload2.put("lastname", "Black");
		finalpayload2.put("totalprice", "333");
		finalpayload2.put("depositpaid", true);
		
		Map<String,Object> bookdatepayload1 = new LinkedHashMap<String,Object>();
		bookdatepayload1.put("checkin", "2018-01-01");
		bookdatepayload1.put("checkout", "2019-01-01");
		
		finalpayload2.put("bookingdates", bookdatepayload1);
		finalpayload2.put("additionalneeds", "Lunch");
		
		RestAssured 
		.given().spec(requestspe)			
			.basePath("booking/1")			
			.header("Content-Type",	"application/json")
			.header("Accept","application/json")
			.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
			.body(finalpayload2)
			.log().all()
		.when()
			.put()
		.then()
			.log().all();
		
	}

}

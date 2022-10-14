package restfullbooker;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;

public class HeadersExample {
	
	@Test
	public void headerSGetMethod() {
		
		RestAssured
			.given()
				.header("HeaderName1","Value1" ) // Single value
				.header("Header2", "Value1", "Value2")
				.header("Username", "username1").and().header("Password","password123")
				.log()
				.all()
			.when()
				.get();		
			
	}
	@Test
public void headerSGetMethod1() {
	
	//Createing the object for Header class
	
	Header h = new Header("Haeder1","Value1");
		
		RestAssured
			.given()
				.log()
				.all()
				.header(h)
			.when()
				.get();		
			
	}
	
	@Test
	public void multipleheaders() {
		RestAssured
		.given()
			.log()
			.all()
			.headers("H1","V1","H2","V2","H3","V3","H4","V4")
		.when()
			.get();		
		
	}
	
	@Test
	public void headersusingMap() {
		Map<String, String> headersMap = new HashMap<>();
		headersMap.put("H1", "V1");
		headersMap.put("H2", "V2");
		headersMap.put("H3", "V3");
		headersMap.put("H4", "V4");
		RestAssured 
			.given()
				.log()
				.all()
					.headers(headersMap)
			.when()
				.get();
		
	}

}

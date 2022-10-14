package restassuredAPI;

import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateNestedJsonObject {

	public static void main(String[] args) {
		
		Map<String, Object> jsonObject= new LinkedHashMap<>();
		jsonObject.put("id", 2);
		jsonObject.put("firstname", "Bharath");
		jsonObject.put("lastname", "Kumar");
		jsonObject.put("married", true);
		jsonObject.put("salary", 15.5);
		
		//nested json address
		Map<String, Object> addressjson = new LinkedHashMap<>();
		addressjson.put("no", "16-10");
		addressjson.put("street name", "ABC");
		addressjson.put("city", "chittor");
		addressjson.put("pin", "123456");
		addressjson.put("state", "AP");
		
		jsonObject.put("address", addressjson);
		
		RestAssured
				.given()
				.log()
				.all()
				.body(jsonObject)
				.get();
		
		

	}

}

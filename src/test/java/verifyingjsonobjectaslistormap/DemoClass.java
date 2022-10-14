package verifyingjsonobjectaslistormap;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class DemoClass {

	public static void main(String[] args) {

		//verifying  the json object as array i.e.List
		RestAssured.get("https://run.mocky.io/v3/8157ada1-2404-4280-b4be-04b20d08fe7e")
		.then().body("", Matchers.instanceOf(List.class));
		
				
		//verifying  the json object  i.e.Map
		RestAssured.get("https://run.mocky.io/v3/54e1bd89-e7ce-4e8a-bb22-23b16fdda91a")
		.then().body("", Matchers.instanceOf(Map.class));
		
		//verifying  the json object of a particular field is array  i.e.List
				RestAssured.get("https://run.mocky.io/v3/daca8d27-a606-4afa-a69b-b47931951186")
				.then().body("contents", Matchers.instanceOf(List.class));

	}
//
	
	
}

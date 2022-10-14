package restfullbooker;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonPathDemo {
	
	@Test
	public void jsonpath_method() {
		
		String jsonbody = "	\r\n"
				+ "{\r\n"
				+ "    \"status\": \"success\",\r\n"
				+ "    \"data\": {\r\n"
				+ "        \"name\": \"test\",\r\n"
				+ "        \"salary\": \"123\",\r\n"
				+ "        \"age\": \"23\",\r\n"
				+ "        \"id\": 25\r\n"
				+ "    }\r\n"
				+ "}";
		
		JsonPath jsp = new JsonPath(jsonbody);
		String jsonStringstatus = jsp.getString("status");
		System.out.println(jsonStringstatus);
		
		Object name = jsp.get("data.name");
		System.out.println(name);
	}

}

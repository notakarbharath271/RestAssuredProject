package com.qa.restassured.pojojackson;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonObjectWithoutPojo {

	public static void main(String[] args) throws IOException {

		ObjectMapper objectmapper = new ObjectMapper();
		Map<String,Object> map = objectmapper.readValue(new File("C:\\Users\\bhara\\eclipse-workspace\\RestAssuredDemo\\Payload\\address.json"), 
				new TypeReference <Map<String,Object>>(){});
		System.out.println(map.get("firstname"));
		
		
		String js = objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
			System.out.println(js);
			map.remove("pincode");
			String js1 = objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
			System.out.println(js1);

	}

}

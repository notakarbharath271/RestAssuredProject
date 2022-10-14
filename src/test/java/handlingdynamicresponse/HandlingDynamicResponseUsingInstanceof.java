package handlingdynamicresponse;

import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HandlingDynamicResponseUsingInstanceof {
	
	
	public static void main(String[] args) {
		
		//https://run.mocky.io/v3/481e3b00-ca87-4c8e-9071-c31b2609394b
		//https://run.mocky.io/v3/1c7b9b81-b879-45a5-8b1d-b86c20f8d703
		Response response = RestAssured.get("https://run.mocky.io/v3/f7f22fcb-e1f8-47ad-9080-a2c80409b522");
		/*
		 * Map responsemap= response.as(Map.class);
		 * 
		 * System.out.println(responsemap.keySet());
		 */
		
		Object respObject = response.as(Object.class);
		
		if(respObject instanceof List) {
			
			List responselist = (List)respObject;
			System.out.println(responselist.size());
		}else {
			Map responsemap = (Map)respObject;
			System.out.println(responsemap.keySet());
		}
		
		
		
		
	}

}

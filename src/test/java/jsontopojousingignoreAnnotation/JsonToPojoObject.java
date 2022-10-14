package jsontopojousingignoreAnnotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToPojoObject {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		
		String jsonPayload = "{\r\n"
				+ "    \"address\" : \"HYD\",\r\n"
				+ "  \"married\" : true,\r\n"
				+ "  \"skills\" : \"CoreJava\"\r\n"
				+ "  \r\n"
				+ "}";
		
		
		ObjectMapper obm = new ObjectMapper();
		EmployeeDetails empd = obm.readValue(jsonPayload, EmployeeDetails.class);
		
		System.out.println(empd.getAddress());
		System.out.println(empd.getName());
		
		System.out.println(empd.getAge());
		
		System.out.println(empd.isMarried());
		
		

	}

}

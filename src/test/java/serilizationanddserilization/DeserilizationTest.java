package serilizationanddserilization;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserilizationTest {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		String jsonplayload = "{\r\n"
				+ "  \"name\" : \"Bharath\",\r\n"
				+ "  \"gender\" : \"Male\",\r\n"
				+ "  \"age\" : 30,\r\n"
				+ "  \"address\" : \"Chittoor\"\r\n"
				+ "}\r\n"
				+ "";
		
		ObjectMapper obmapper = new ObjectMapper();
		
		PojoCalssEmpDetials pemp = obmapper.readValue(jsonplayload, PojoCalssEmpDetials.class);
		
		System.out.println(pemp.getAddress());
		
		pemp.setAge(23);
		
		System.out.println(pemp.getAge());
		
		//Map
		
		Map<String,Object> mappemp = obmapper.readValue(jsonplayload,Map.class);
		
		  System.out.println(mappemp.get("name"));
	}

}

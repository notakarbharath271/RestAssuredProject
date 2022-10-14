package package1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ComplexPlayload {

	public static void main(String[] args) throws JsonProcessingException {
		
		List<Map<String,Object>> finalpayload = new ArrayList<Map<String,Object>>();
		
		Map<String,Object> map1 = new LinkedHashMap<String,Object>();
		map1.put("id", 1);
		map1.put("first_name", "Bharath");
		map1.put("last_name", "Kumar");
		map1.put("gender", "Male");
		map1.put("email", "bharath@gmail.com");
		
		List<String> mob = new ArrayList<String>();
		mob.add("9879879870");
		mob.add("6546543210");
		
		map1.put("mobile", mob);
		
		Map<String,Object> map2 = new LinkedHashMap<String,Object>();
		map2.put("designation", "Test Analyst");
		map2.put("company", "SDET");
		
		map1.put("skills", map2);
		
		
		
		finalpayload.add(map1);
		
		ObjectMapper ob = new ObjectMapper();
		String jsonobject = ob.writerWithDefaultPrettyPrinter().writeValueAsString(finalpayload);
		System.out.println(jsonobject);
		

	}

}

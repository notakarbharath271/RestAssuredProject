package package1;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonObjectusingMap {

	public static void main(String[] args) throws JsonProcessingException {
		
		Map<String, Object> mp = new HashMap<String,Object>();
		
		mp.put("name","Tesla");
		mp.put("model","200modle");
		mp.put("feature","driverless");
		mp.put("fuletype","charging");
		
		ObjectMapper ob = new ObjectMapper();
		String jsonobject = ob.writerWithDefaultPrettyPrinter().writeValueAsString(mp);
		
		System.out.println(jsonobject);
		
		

	}

}

package package1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonObjectusingMapList {

	public static void main(String[] args) throws JsonProcessingException {
		
		Map<String, Object> mp = new LinkedHashMap<String,Object>() ;
		
		mp.put("firstname","Bharath");
		mp.put("lastname","N");
		mp.put("gender","male");
		mp.put("married",true);
		
		List<String> ls = new ArrayList<String>();
		
		ls.add("Core Java");
		ls.add("RestAssured");
		ls.add("Selenium");
		ls.add("TestComplete");
		
		
		
		Map<String, Object> mp1 = new LinkedHashMap<String,Object>();
		mp1.put("doorno", "13#100");
		mp1.put("Street", "123mainstreet");
		mp1.put("city", "CTY");
		mp1.put("state", "NY");
		mp1.put("pincode", "12500");
		
		mp.put("skills", ls);
		
		mp.put("Address", mp1);
		
		ObjectMapper obm = new ObjectMapper();
		String jsonobject = obm.writerWithDefaultPrettyPrinter().writeValueAsString(mp);
		System.out.println(jsonobject);
		
		

	}

}

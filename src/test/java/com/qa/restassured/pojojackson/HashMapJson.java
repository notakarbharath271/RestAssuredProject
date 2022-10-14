package com.qa.restassured.pojojackson;

import java.util.HashMap;
import java.util.Map;

public class HashMapJson {
	
	public Map<String, Object> hashmap() {
	
	Map<String,Object> mp = new HashMap<String,Object>();
	mp.put("name", "Bharath");
	mp.put("lastname", "Kumar");
	
	return mp;
	
	
	}
}

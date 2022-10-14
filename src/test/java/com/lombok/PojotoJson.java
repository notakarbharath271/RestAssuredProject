package com.lombok;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PojotoJson {

	public static void main(String[] args) throws JsonProcessingException {
		
		Employee emp = new Employee();
		emp.setFirstname("Bharath");
		emp.setLastname("Kumar");
		emp.setGender("Male");
		emp.setAddress("HYD");
		
		ObjectMapper ob = new ObjectMapper();
		String jsonObject = ob.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
		
		System.out.println(jsonObject);
		

	}

}

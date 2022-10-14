package com.lombok;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PojotoJsonWithbuilder {

	public static void main(String[] args) throws JsonProcessingException {
		
	EmployeeBuilder empbuilder = EmployeeBuilder.builder()
			.firstname("Bharath")
			.lastname("Kumar")
			.gender("male")
			.address("Chittoor").build();
	
	ObjectMapper objectmapper = new ObjectMapper();
	
	String jsonObject = objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(empbuilder);
	System.out.println(jsonObject);
		

	}

}

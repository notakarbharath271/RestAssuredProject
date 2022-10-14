package com.lombok;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PojotoJsonWithbuilder2 {

	public static void main(String[] args) throws JsonProcessingException {
		
	EmployeeBuilder2 empbuilder = EmployeeBuilder2.builder()
			.firstname("Bharath")
			.lastname("Kumar")
			.gender("male")
			.address("Chittoor").build();
	
	ObjectMapper objectmapper = new ObjectMapper();
	
	String jsonObject = objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(empbuilder);
	System.out.println(jsonObject);
	
	System.out.println("-------------------------------------------------");
	//updating the values
	 EmployeeBuilder2 emp2= empbuilder.toBuilder()
			 .firstname("Sarath")
			 .lastname("Kumar")
			 .gender("Male")
			 .address("Chittoor")
			 .married(false).build();
	 
	 String jsonObject2 = objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp2);
		System.out.println(jsonObject2);

	}

}

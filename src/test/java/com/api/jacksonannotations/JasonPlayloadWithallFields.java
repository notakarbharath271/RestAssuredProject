package com.api.jacksonannotations;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JasonPlayloadWithallFields {
	
	
	@Test
	public void employeedetailswithallfields() throws JsonProcessingException {
		
		
		EmployeePojo emp = new EmployeePojo();
		emp.setName("Bharath");
		emp.setAge(31);
		emp.setMarriage(true);
		emp.setGender('M');
		emp.setMobileno("9494335417");
		
		ObjectMapper objmapper = new ObjectMapper();
		String jsonString = objmapper.writerWithDefaultPrettyPrinter() .writeValueAsString(emp);
		System.out.println(jsonString);
		
		
	}
}

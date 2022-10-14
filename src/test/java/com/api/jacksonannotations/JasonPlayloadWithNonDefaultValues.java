package com.api.jacksonannotations;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JasonPlayloadWithNonDefaultValues {
	
	
	@Test
	public void employeedetailswithallfields() throws JsonProcessingException {
		
		
		EmployeePojo emp = new EmployeePojo();
		emp.setName("Bharath");
		emp.setAge(0);
		emp.setMarriage(false);
		emp.setGender('M');
		emp.setMobileno("9494335417");
		
		emp.setSkills(new ArrayList<String>());
		emp.setFamilymembers(new HashMap<String, Object>());
		
		ObjectMapper objmapper = new ObjectMapper();
		String jsonString = objmapper.writerWithDefaultPrettyPrinter() .writeValueAsString(emp);
		System.out.println(jsonString);
		
		
	}
}

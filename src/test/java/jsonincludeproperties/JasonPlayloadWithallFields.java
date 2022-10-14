package jsonincludeproperties;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JasonPlayloadWithallFields {
	
	
	@Test
	public void employeedetailswithallfields() throws JsonProcessingException {
		
		
		ChildSkills emp = new ChildSkills();
		emp.setName("Bharath");
		emp.setAge(31);
		emp.setMarriage(true);
		emp.setGender('M');
		emp.setMobileno("9494335417");
		emp.setSkills("Java");
	
		
		
		ObjectMapper objmapper = new ObjectMapper();
		String jsonString = objmapper.writerWithDefaultPrettyPrinter() .writeValueAsString(emp);
		System.out.println(jsonString);
		
		
	}
}

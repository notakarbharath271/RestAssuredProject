package serilizationanddserilization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerilizationTest {

	public static void main(String[] args) throws JsonProcessingException {
		
		PojoCalssEmpDetials emp = new PojoCalssEmpDetials();
		
		emp.setName("Bharath");
		emp.setAge(30);
		emp.setGender("Male");
		emp.setAddress("Chittor");
		
		ObjectMapper obm = new ObjectMapper();
		String jsonempdetails = obm.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
		System.out.println(jsonempdetails);

	}

}

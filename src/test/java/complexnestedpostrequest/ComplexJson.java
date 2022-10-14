package complexnestedpostrequest;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import complexnestedpostrequest.Courses.ApiAutomation;
import complexnestedpostrequest.Courses.MobileAutomation;
import complexnestedpostrequest.Courses.WebAutomation;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ComplexJson {

	public static void main(String[] args) throws IOException {

		List<WebAutomation> webAuto = new ArrayList<WebAutomation>();
		Courses.WebAutomation sel = new Courses.WebAutomation();
		sel.setCourseTitle("Selenium");
		sel.setPrice(5000);

		webAuto.add(sel);

		Courses.WebAutomation pro = new Courses.WebAutomation();
		pro.setCourseTitle("Protractor");
		pro.setPrice(5000);

		webAuto.add(pro);

		List<ApiAutomation> apiAuto = new ArrayList<ApiAutomation>();
		Courses.ApiAutomation restass = new Courses.ApiAutomation();
		restass.setCourseTitle("RestAssured");
		restass.setPrice(4000);
		apiAuto.add(restass);

		Courses.ApiAutomation soap = new Courses.ApiAutomation();
		soap.setCourseTitle("SOAP API Automation");
		soap.setPrice(3000);
		apiAuto.add(soap);

		List<MobileAutomation> mobAuto = new ArrayList<MobileAutomation>();
		Courses.MobileAutomation appium = new Courses.MobileAutomation();
		appium.setCourseTitle("Appium");
		appium.setPrice(1000);

		mobAuto.add(appium);

		Courses courses = new Courses();
		courses.setWebAutomation(webAuto);
		courses.setApiAutomation(apiAuto);
		courses.setMobileAutomation(mobAuto);

		ServicesPojoClass sp = new ServicesPojoClass();
		sp.setInstructor("Bharath");
		sp.setUrl("softwareautomation.com");
		sp.setServices("Software Testing");
		sp.setExpertise("Testing");
		sp.setCourses(courses);
		sp.setLinkedIn("BharathLinkedIn");
		
		ObjectMapper om = new ObjectMapper();
		
		//writeValueAsString
		//String convertedjson = om.writeValueAsString(sp);
		//System.out.println(convertedjson);
		
		//write in to a file
		String userdir = System.getProperty("user.dir");
		File outputjsonfile = new File(userdir+"/Payload/comp.json");
		om.writerWithDefaultPrettyPrinter().writeValue(outputjsonfile, sp);

		
		
		  Response postresponse = given().auth().none().header("Content-Type",
		  "application/json")
		  .contentType(ContentType.JSON).when().body(outputjsonfile).log().all().post(
		  "https://reqres.in/api/users");
		  
		  postresponse.prettyPrint();
		 
		 
	}

}

package restfullbooker;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.config.RestAssuredConfig;

public class OverWriteHeaderValuesWithSameHerdername {
	
	@Test
	public void overwriteheaderValue() {
		RestAssured
			.given()
				.config(RestAssuredConfig.config()
						.headerConfig(HeaderConfig.
								headerConfig().
								overwriteHeadersWithName("Header1","Header2")))
				.header("Header1","Value1")
				.header("Header2","Value2")
				.header("Header1","Value2")
				.header("Header2","Value1")
				.log()
				.all()
			.when()
				.get();
	}

}

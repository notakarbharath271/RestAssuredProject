package Authorization;

import org.testng.annotations.Test;

import base.Base;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Authorization extends Base {

//	@Test
	public void basicAuth() {

		Response resp = RestAssured.given().baseUri("https://postman-echo.com/").basePath("basic-auth").auth()
				.basic("postman", "password").get();
		String resBody = resp.getBody().prettyPrint();
		// System.out.println(resBody);
		Object jsonboject = resp.body().jsonPath().get("$");
		System.out.println(jsonboject);

	}

	// @Test
	public void BearerToken() {
		String response = RestAssured.given().baseUri("https://api.github.com/").basePath("user/repos")
				.headers("Authorization", "Bearer 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").get().asPrettyString();

		System.out.println(response);
	}

	@Test
	public void DigestAuth() {
		RestAssured.given().auth().digest("postman", "password").get("https://postman-echo.com/digest-auth").getBody()
				.prettyPrint();
	}

	// Api Key: c066fa687b7045148bd61cddb248b97b
	// End piont :
	// https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid={API
	// key}
	@Test
	public void apiKey() {

		Response weatherresp = RestAssured.given().baseUri("https://api.openweathermap.org/")
				.basePath("data/2.5/weather").queryParam("lat", 44.34).queryParam("lon", 10.99)
				.queryParam("appid", "c066fa687b7045148bd61cddb248b97b").get();

		weatherresp.prettyPeek();

	}
	@Test
	public void oAuth2() {
		String token = "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";
		RestAssured.given().baseUri("https://api.github.com/").basePath("user/repos").auth().oauth2(token)
				.get().prettyPrint();
		
	}

}

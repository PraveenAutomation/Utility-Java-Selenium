package getRequest;

import io.restassured.RestAssured;

public class BasicAuth {
	
	public void basicAuth()
	{
		RestAssured.given()
		.auth().preemptive()
		.basic("", "")
		.when()
		.get()
		.getStatusCode();
	}

}

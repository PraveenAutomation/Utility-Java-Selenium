package getRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAuthenticationDemo extends BaseClass {
	
	@Test
	public void authDemo()
	{
		int code=RestAssured.given()
		.get()
		.statusCode();
		
		System.out.println("Status code is : "+code);
	}

}

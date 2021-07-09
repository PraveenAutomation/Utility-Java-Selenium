package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstGetAPI {
	
	@Test
	public void getStatusCode()
	{
		Response resp=RestAssured.get("https://reqres.in/api/users?page=2");
		int code=resp.statusCode();
		System.out.println("Status code is "+code);
		Assert.assertEquals(code, 200);
	}

}

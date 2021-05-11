package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {
	
	/*
	 * @BeforeTest public void setUp() throws Exception { RestAssured.port = port; }
	 */
	
	@Test
	public void testResponse()
	{
		Response resp=RestAssured.get("https://reqres.in/api/users?page=2");
		
		int code=resp.getStatusCode();
		
		System.out.println("Status code is"+code);
		
		Assert.assertEquals(code,200);
	}

}

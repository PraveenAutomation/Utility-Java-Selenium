package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetData2 {
	
	/*
	 * @BeforeTest public void setUp() throws Exception { RestAssured.port = port; }
	 */
	
	@Test
	public void testResponse()
	{
		int code=get("https://reqres.in/api/users?page=2").getStatusCode();
				
		System.out.println("Status code is "+code);
		
		Assert.assertEquals(code, 200);
	}
	
	@Test
	public void getBody()
	{
		String data=get("https://reqres.in/api/users?page=2").asString();
		
		System.out.println("Body is "+data);
		
	}

}

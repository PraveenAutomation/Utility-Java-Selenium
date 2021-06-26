package getRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostCall_Registration {
	
	@Test
	public void RegistrationByPost()
	{
		RestAssured.baseURI="http://restapi.demoqa.com/customer/register";
		RequestSpecification request=RestAssured.given();
		
		JSONObject json=new JSONObject();
		json.put("FirstName", "Virender"); // Cast
		json.put("LastName", "Singh");
		json.put("UserName", "sdimpleuser2dd2011");
		json.put("Password", "password1");
		
		json.put("Email", "sample2ee26d9@gmail.com");
		request.body(json.toJSONString());
		Response response = request.post("/register");
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, "201");
		String successCode = response.jsonPath().get("SuccessCode");
		Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
		
		
	}

}

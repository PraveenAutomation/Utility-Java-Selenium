package getRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Delete_PutExample {
	
	@Test
	public void postCall()
	{
		
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","applicatiom/json");
		JSONObject json=new JSONObject();
		json.put("email","eve.holt@reqres.in");
		json.put("password", "pistol");
		
		request.body(json.toJSONString());
		
		Response response=request.post("/api/register");
		int code=response.getStatusCode();
		
		Assert.assertEquals(code, 200);
		
		
	}

}

package org.testing.testSteps;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Properties;

import org.testing.utilities.PropertiesHandle;

public class HTTPMethods {
	
	Properties pr;
	
	public HTTPMethods(Properties pr)
	{
		this.pr = pr;
		
	}
	
	
	public void postMethod(String uriKeyName , String requestBody) {
		
		
		String urlValue = pr.getProperty(uriKeyName);
		
		Response res =
		given()
		.contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.post(urlValue);
			
		System.out.println("Status Code is " + res.statusCode());
	}

	
	public void getAllMethod(String urikey)
	{
		
		String urlValue = pr.getProperty(urikey);
		
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(urlValue);
		
		System.out.println(res.asString());
		
		
	System.out.println(res.statusCode());
		
		
	}
	
	public void getPerticular(String uriKey , String id)
	{
		String urlValue = pr.getProperty(uriKey);
		
		String getperticular = urlValue + "/" + id ; 
		
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(getperticular);
		
		
		System.out.println(res.asString());
		
		System.out.println(res.statusCode());
		
	}
	
	
	public void deletePerticular(String uriKey , String id )
	{
		
		String urlValue = pr.getProperty(uriKey);
		
		String deletePerticular = urlValue + "/" + id;
		
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(deletePerticular);
		
		System.out.println(res.asString());
		
		System.out.println(res.statusCode());
		
		
	}
	
}

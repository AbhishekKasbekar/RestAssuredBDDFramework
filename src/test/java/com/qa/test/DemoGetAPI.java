package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class DemoGetAPI {

	String url = "http://localhost:3000/posts";

	// This test is for get the response from API
	@Test(priority=2)
	public void test_01() {
		Response resp = given().when().get(url);
		System.out.println("Get response is : " + resp.asString());
		System.out.println("The status code for above API returns -->" + resp.getStatusCode());
		Assert.assertEquals(resp.getStatusCode(), 200);
	}

	// This test is for the create a record by using POST method
	// How to use parameters with restAssured

	@Test(priority=1)
	public void test_02() {

		Response resp = given().
		body("{\r\n"
				+ "    \"title\": \"Abhishek Kasbe\",\r\n"
				+ "    \"Author\": \"Demo\"\r\n"
				+ "}")
		.when(). 
		contentType(ContentType.JSON).
		post(url);
		
		System.out.println(resp.asString());
		Assert.assertEquals(resp.getStatusCode(), 201);
		
	}
	
	public void test_03()
	{
		
		//this method is for the getting perticular record by setting id 
		
		
	}
	public void test_04()
	{
		
		
		
		
	}
	
	public void test_05()
	{
		
		// This is new testing commit to check the changes on github
		
		
	}

}

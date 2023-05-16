package com.nodeArmy.java.main.util;

import com.google.gson.Gson;
import com.nodeArmy.java.main.base.Base;
import com.nodeArmy.java.main.pages.invitetoJoinAsProjectAdmin;
import com.nodeArmy.java.main.pages.modifyExistingProject;
import org.testng.Assert;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {

	public Gson gson = new Gson();

	public Response get_Projects(int platformId, Base base) {
		RequestSpecification requestSpec = RestAssured.given();
		requestSpec.accept("application/json");
		String endpoint = "/platform/dashboard/" + Integer.toString(platformId);
		Response response = RestAssured.get(base.baseUrl + endpoint);
		return response;
	}

	public Response post_InviteToJoinAsProjectAdmin(invitetoJoinAsProjectAdmin details, Base base) {
		RequestSpecification requestSpec = RestAssured.given();
		requestSpec.accept("application/json");
		String endpoint = "/project/admin/invite";
		String requestBody = gson.toJson(details);
		Response response = RestAssured.given().body(requestBody).when().post(base.baseUrl + endpoint);
		return response;
	}

	public Response patch_ModifyExistingProject(modifyExistingProject details, Base base) {
		RequestSpecification requestSpec = RestAssured.given();
		requestSpec.accept("application/json");
		String endpoint = "/project";
		String requestBody = gson.toJson(details);
		Response response = RestAssured.given().body(requestBody).when().patch(base.baseUrl + endpoint);
		return response;
	}

	public int getStatusCode(Response response) {
		int statusCode = response.getStatusCode();
		return statusCode;
	}

	public void fieldVerification(String field, Response response, String expectedValue) {
		String actualValue = response.jsonPath().getString(field);
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("Successfully verified: " + field);
	}

}

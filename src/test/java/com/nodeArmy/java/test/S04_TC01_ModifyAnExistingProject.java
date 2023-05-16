package com.nodeArmy.java.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.nodeArmy.java.main.base.Base;
import com.nodeArmy.java.main.pages.modifyExistingProject;
import com.nodeArmy.java.main.util.Utils;
import io.restassured.response.Response;

public class S04_TC01_ModifyAnExistingProject {

	public Base base = new Base();
	public Utils util = new Utils();
	public modifyExistingProject modify = new modifyExistingProject();
	private static final Logger logger = LogManager.getLogger(S01_TC01_DisplayProjectsTest.class);
	
	@BeforeClass
	public void setUp() {
		String baseUrl = "https://alkimi.org/api/nodearmy/v3/";
		base.setUp(baseUrl);
		System.out.println("Established URL successfully.");
	}

	@Test 
	public void testPatchModifyExistingProject() {

		modify.setPlatformId(1234);
		logger.info("platformId is set as 1234");
		modify.setProjectId(10);
		logger.info("projectId is set as 10");
		modify.setProjectName("Alkimi Project");
		logger.info("projectName is set as Alkimi Project");
		modify.setProjectStatus(1);
		logger.info("projectStatus is set as 1");

		// Send POST request to /project
		Response response = util.patch_ModifyExistingProject(modify, base);
		logger.info("Successfully established the connection and got the response: " + response);
		
		// Verify the response status code
		int statusCode = util.getStatusCode(response);
		Assert.assertEquals(statusCode, 200);
		logger.info("Successfully asserted statusCode");
		logger.error("Assertion failed on statusCode..!!!");
		
	}

}

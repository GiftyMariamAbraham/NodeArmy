package com.nodeArmy.java.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.nodeArmy.java.main.base.Base;
import com.nodeArmy.java.main.util.Utils;
import com.nodeArmy.java.main.pages.displayProjects;
import io.restassured.response.Response;

public class S01_TC01_DisplayProjectsTest {

	public Base base = new Base();
	public Utils util = new Utils();
	public displayProjects projects = new displayProjects();
	private static final Logger logger = LogManager.getLogger(S01_TC01_DisplayProjectsTest.class);

	@BeforeClass
	public void setUp() {
		String baseUrl = "https://alkimi.org/api/nodearmy/v3/";
		base.setUp(baseUrl);
		logger.info("Established URL successfully.");
	}

	@Test
	public void testGetProjects() {

		projects.setPlatformId(1234);
		logger.info("platformId is set as 1234");

		// Send GET request to /platform/dashboard/{platformId}
		Response response = util.get_Projects(projects.getPlatformId(), base);
		logger.info("Successfully established the connection and got the response: " + response);

		// Verify the response status code
		int statusCode = util.getStatusCode(response);
		Assert.assertEquals(statusCode, 200);
		logger.info("Successfully asserted statusCode");
		logger.error("Assertion failed on statusCode..!!!");

		// Verify the platformId from the response
		util.fieldVerification("platformId", response, Integer.toString(projects.getPlatformId()));
		logger.info("Successfully asserted field value");
		logger.error("Assertion failed on field value verification..!!!");

	}

}

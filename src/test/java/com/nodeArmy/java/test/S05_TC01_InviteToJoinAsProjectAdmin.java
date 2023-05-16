package com.nodeArmy.java.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.nodeArmy.java.main.base.Base;
import com.nodeArmy.java.main.pages.invitetoJoinAsProjectAdmin;
import com.nodeArmy.java.main.util.Utils;
import io.restassured.response.Response;

public class S05_TC01_InviteToJoinAsProjectAdmin {

	public Base base = new Base();
	public Utils util = new Utils();
	public invitetoJoinAsProjectAdmin invite = new invitetoJoinAsProjectAdmin();
	private static final Logger logger = LogManager.getLogger(S01_TC01_DisplayProjectsTest.class);
	
	@BeforeClass
	public void setUp() {
		String baseUrl = "https://alkimi.org/api/nodearmy/v3/";
		base.setUp(baseUrl);
		System.out.println("Established URL successfully.");
	}
	
	@Test
    public void testPostInviteToJoinAsProjectAdmin() {
		
		invite.setProjectId(3232);
		logger.info("projectId is set as 3232");
		invite.setWalletId(133424);
		logger.info("walletId is set as 133424");
		invite.setEmailId("mr@abc.com");
		logger.info("emailId is set as mr@abc.com");
		
		// Send POST request to /project/admin/invite
        Response response = util.post_InviteToJoinAsProjectAdmin(invite, base);
        logger.info("Successfully established the connection and got the response: " + response);
        
        // Verify the response status code
        int statusCode = util.getStatusCode(response);
        Assert.assertEquals(statusCode, 200);
        logger.info("Successfully asserted statusCode");
		logger.error("Assertion failed on statusCode..!!!");
		
	}
}

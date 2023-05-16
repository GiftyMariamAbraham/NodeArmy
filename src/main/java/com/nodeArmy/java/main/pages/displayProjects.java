package com.nodeArmy.java.main.pages;

public class displayProjects {

	int platformId;
	String projectName;
	String criteria;
	String enrollmentEndDate;
	String userStatus;
	String nodeType;
	String reward;

	public int getPlatformId() {
		return platformId;
	}

	public void setPlatformId(int platformId) {
		this.platformId = platformId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCriteria() {
		return criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

	public String getEnrollmentEndDate() {
		return enrollmentEndDate;
	}

	public void setEnrollmentEndDate(String enrollmentEndDate) {
		this.enrollmentEndDate = enrollmentEndDate;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getNodeType() {
		return nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public displayProjects() {
		super();
		// TODO Auto-generated constructor stub
	}

	public displayProjects(int platformId, String projectName, String criteria, String enrollmentEndDate,
			String userStatus, String nodeType, String reward) {
		super();
		this.platformId = platformId;
		this.projectName = projectName;
		this.criteria = criteria;
		this.enrollmentEndDate = enrollmentEndDate;
		this.userStatus = userStatus;
		this.nodeType = nodeType;
		this.reward = reward;
	}

}

package com.nodeArmy.java.main.pages;

public class modifyExistingProject {

	int platformId;
	int projectId;
	String projectName;
	int projectStatus;

	public int getPlatformId() {
		return platformId;
	}

	public void setPlatformId(int platformId) {
		this.platformId = platformId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(int projectStatus) {
		this.projectStatus = projectStatus;
	}

	public modifyExistingProject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public modifyExistingProject(int platformId, int projectId, String projectName, int projectStatus) {
		super();
		this.platformId = platformId;
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectStatus = projectStatus;
	}

}

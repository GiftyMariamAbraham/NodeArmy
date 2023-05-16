package com.nodeArmy.java.main.pages;

public class invitetoJoinAsProjectAdmin {

	int projectId;
	int walletId;
	String emailId;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getWalletId() {
		return walletId;
	}

	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public invitetoJoinAsProjectAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public invitetoJoinAsProjectAdmin(int projectId, int walletId, String emailId) {
		super();
		this.projectId = projectId;
		this.walletId = walletId;
		this.emailId = emailId;
	}

}

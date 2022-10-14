package com.api.restAssured;

public class Details {
	
	private String companyname;
	public String getCompanyname() {
		return companyname;
	}
	public Details(String companyname, String emailid) {
		super();
		this.companyname = companyname;
		this.emailid = emailid;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	private String emailid;
	
	
	

}

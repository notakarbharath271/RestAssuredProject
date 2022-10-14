package com.api.restAssured;

public class EmployeeDetails {

	private String name;
	private String job;
	private String[] skills;
	private Details details;

	public EmployeeDetails(String name, String job, String[] skills, String companyname, String emailid) {
		this.name = name;
		this.job = job;
		this.skills = skills;
		this.details = new Details(companyname, emailid);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public Details getDetails() {
		return details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}

}

package com.lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Builder
@Getter
public class EmployeeBuilder {
	
	private String firstname;
	private String lastname;
	private String gender;
	private boolean married;
	private String address;

}

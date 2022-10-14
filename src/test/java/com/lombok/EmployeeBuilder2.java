package com.lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Builder(toBuilder = true)
@Getter
public class EmployeeBuilder2 {
	
	private String firstname;
	private String lastname;
	private String gender;
	private boolean married;
	private String address;

}

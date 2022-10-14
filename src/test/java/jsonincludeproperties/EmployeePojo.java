package jsonincludeproperties;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

@JsonIncludeProperties(value ={"name","age","skills"})
public class EmployeePojo {
	
	private String name;
	private int age;
	private boolean marriage;
	private char gender;
	private String mobileno;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMarriage() {
		return marriage;
	}
	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

}

package com.cts;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EmployeeBean_Valid {
	@Min(4)//value is equal or greater than 4
	String eno;
	
	@Size(min=5,max=20)
	String name;
	
	@Min(value=20000,message="Salary Must be equal or greater than 20000")
	@Max(value=45000,message="Salary must be equal or less than 45000")
	float salary;
	
	@Pattern(regexp="^[a-zA-Z0-9]{6}",message="must be of 6 char/digit")
	String postal_code;
	public String getEno() {
		return eno;
	}
	public void setEno(String eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	

}

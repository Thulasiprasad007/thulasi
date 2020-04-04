package com.cts.springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Admin")
public class Admin {
	
	@Id
	private long id;
	@Column
	private String Ausername;
	@Column
	private String Apassword;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAusername() {
		return Ausername;
	}
	public void setAusername(String ausername) {
		Ausername = ausername;
	}
	public String getApassword() {
		return Apassword;
	}
	public void setApassword(String apassword) {
		Apassword = apassword;
	}
	
	
	
}

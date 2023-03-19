package com.example.demo.EmployeeDao;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "login")
public class Login {

	@Id
	@Column(name = "empid")
	private int  empid;
	
	private String password;
	
	
	
	
//	@ManyToOne
//	@JoinColumn(name="empid")
//	private User user;


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	public Login(int empid, String password) {
		super();
		this.empid = empid;
		this.password = password;
	}


	@Override
	public String toString() {
		return "Login [empid=" + empid + ", password=" + password + "]";
	}


	public Login() {
		super();
		
	}


	

	
	
	
}
	
	
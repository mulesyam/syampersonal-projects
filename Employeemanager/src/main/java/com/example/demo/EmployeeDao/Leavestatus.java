package com.example.demo.EmployeeDao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leavestatus")
public class Leavestatus {

	
	@Id
	@Column(name = "empid")
	private int empid;
	
	@Column(name = "isapproved")
	private boolean isapproved;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public boolean isIsapproved() {
		return isapproved;
	}

	public void setIsapproved(boolean isapproved) {
		this.isapproved = isapproved;
	}

	

//	public void setIsapproved(boolean isapproved2) {
//		// TODO Auto-generated method stub
//		
//	}
	
	
	
}

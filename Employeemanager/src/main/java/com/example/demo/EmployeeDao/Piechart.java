package com.example.demo.EmployeeDao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "piechart")
public class Piechart {

	@Id
	@Column(name = "empid")
	private int empid;
	
	
	@Column(name= "workingdays")
	private int workingdays;

	@Column(name = "leaves")		
	private int leaves;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getWorkingdays() {
		return workingdays;
	}

	public void setWorkingdays(int workingdays) {
		this.workingdays = workingdays;
	}

	public int getLeaves() {
		return leaves;
	}

	public void setLeaves(int leaves) {
		this.leaves = leaves;
	}

	@Override
	public String toString() {
		return "Piechart [empid=" + empid + ", workingdays=" + workingdays + ", leaves=" + leaves + "]";
	}

	public Piechart(int empid, int workingdays, int leaves) {
		super();
		this.empid = empid;
		this.workingdays = workingdays;
		this.leaves = leaves;
	}

	public Piechart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}

package com.example.demo.EmployeeDao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "newtable")
public class LeaveManagement {
	

     @Id
     @Column(name="empid")
     private int empid; 
   

	@Column(name="fromdate")
	private String fromdate;

	@Column(name="todate")
	private String todate;
	
	@Column(name="leavetype")
	private String leavetype;
	
	@Column(name="reason")
	private String reason;
	
	
	
	@Column(name ="status")
	private Integer status;
//	@Column(name= "status")
//	private int status;
	
//	@Column(name="isApproved")
//	private boolean isApproved;
//	
//	
//	private boolean acceptrejectflag;
//	  
//	 private boolean active;
//	 
	
	
	
	
	/*
	 * public boolean isAcceptrejectflag() { return acceptrejectflag; }
	 * 
	 * 
	 * public void setAcceptrejectflag(boolean acceptrejectflag) {
	 * this.acceptrejectflag = acceptrejectflag; }
	 * 
	 * 
	 * public boolean isActive() { return active; }
	 * 
	 * 
	 * public void setActive(boolean active) { this.active = active; }
	 */

//	public boolean isApproved() {
//		return isApproved;
//	}
//
//
//	public void setApproved(boolean isApproved) {
//		this.isApproved = isApproved;
//	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}




	public LeaveManagement() {
		super();
	}

	
	public String getFromdate() {
		return fromdate;
	}

	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}

	public String getTodate() {
		return todate;
	}

	public void setTodate(String todate) {
		this.todate = todate;
	}

	public String getLeavetype() {
		return leavetype;
	}

	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public LeaveManagement(int empid, String fromdate, String todate, String leavetype, String reason) {
		super();
		this.empid = empid;
		this.fromdate = fromdate;
		this.todate = todate;
		this.leavetype = leavetype;
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "LeaveManagement [empid=" + empid + ", fromdate=" + fromdate + ", todate=" + todate + ", leavetype="
				+ leavetype + ", reason=" + reason + "]";
	}


}

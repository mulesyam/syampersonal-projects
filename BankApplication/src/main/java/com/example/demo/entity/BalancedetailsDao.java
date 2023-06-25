package com.example.demo.entity;

import java.time.format.DateTimeFormatter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="accountsdetails")
public class BalancedetailsDao {
	@Id
	
	@Column(name = "customerid")
	private int customerid;
	
	@Column(name = "accountnumber")
	private String accountnumber;
	
	@Column(name = "accounttype")
	private  String accounttype;
	
	@Column(name = "branchaddress")
	private String branchaddress;
	
	@Column(name = "creditdate")
	private int creditdate;

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getBranchaddress() {
		return branchaddress;
	}

	public void setBranchaddress(String branchaddress) {
		this.branchaddress = branchaddress;
	}

	public int getCreditdate() {
		return creditdate;
	}

	public void setCreditdate(int creditdate) {
		this.creditdate = creditdate;
	}

	@Override
	public String toString() {
		return "AccountdetailsDao [customerid=" + customerid + ", accountnumber=" + accountnumber + ", accounttype="
				+ accounttype + ", branchaddress=" + branchaddress + ", creditdate=" + creditdate + "]";
	}

	public BalancedetailsDao(int customerid, String accountnumber, String accounttype, String branchaddress,
			int creditdate) {
		super();
		this.customerid = customerid;
		this.accountnumber = accountnumber;
		this.accounttype = accounttype;
		this.branchaddress = branchaddress;
		this.creditdate = creditdate;
	}

	public BalancedetailsDao() {
		super();
		
	}
	
	
	
	
	
	
	
	

}

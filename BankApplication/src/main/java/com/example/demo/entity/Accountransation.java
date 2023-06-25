package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="accounttransation")
public class Accountransation {
	@Id
	
	@Column(name="customerid")
	private int customerid;
	
	
	@Column(name="accountnumber")
	private String accountnumber;
	
	@Column(name="transactionid")
	private int transactionid;
	
	@Column(name="transaciondate")
	private String transactiondate;
	 
	@Column(name="transacionamount")
	private String transacionamount;
	
	@Column(name="transacionsummary")
	private String transacionsummary;
	
	@Column(name="transaciontype")
	private String transaciontype;
	
	
	@Column(name="closingbalance")
	private String closingbalance;
	
	@Column(name="closingdate")
	private String closingdate;

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

	public int getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}

	public String getTransactiondate() {
		return transactiondate;
	}

	public void setTransactiondate(String transactiondate) {
		this.transactiondate = transactiondate;
	}

	public String getTransacionamount() {
		return transacionamount;
	}

	public void setTransacionamount(String transacionamount) {
		this.transacionamount = transacionamount;
	}

	public String getTransacionsummary() {
		return transacionsummary;
	}

	public void setTransacionsummary(String transacionsummary) {
		this.transacionsummary = transacionsummary;
	}

	public String getTransaciontype() {
		return transaciontype;
	}

	public void setTransaciontype(String transaciontype) {
		this.transaciontype = transaciontype;
	}

	public String getClosingbalance() {
		return closingbalance;
	}

	public void setClosingbalance(String closingbalance) {
		this.closingbalance = closingbalance;
	}

	public String getClosingdate() {
		return closingdate;
	}

	public void setClosingdate(String closingdate) {
		this.closingdate = closingdate;
	}
	
	
	
	
	
	

}

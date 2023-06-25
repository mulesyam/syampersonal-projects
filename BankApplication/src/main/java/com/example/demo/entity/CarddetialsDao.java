package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="carddetails")
public class CarddetialsDao {
	@Id
	@Column(name="cardid")
	private int cardid;
	
	@Column(name="cardnumber")
	private int cardnumber;
	
	@Column(name="customerid")
	private int customerid;
	
	@Column(name="cardtype")
	private String cardtype;
	
	@Column(name="totallimit")
	private String totallimit;
	
	@Column(name="amountused")
	private String  amountused;
	
	@Column(name="availableamount")
	private String  availableamount;
	
	@Column(name="creditdate")
	private String  creditdate;
	

	public int getCardid() {
		return cardid;
	}


	public void setCardid(int cardid) {
		this.cardid = cardid;
	}


	public int getCardnumber() {
		return cardnumber;
	}


	public void setCardnumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}


	public int getCustomerid() {
		return customerid;
	}


	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}


	public String getCardtype() {
		return cardtype;
	}


	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}


	public String getTotallimit() {
		return totallimit;
	}


	public void setTotallimit(String totallimit) {
		this.totallimit = totallimit;
	}


	public String getAmountused() {
		return amountused;
	}


	public void setAmountused(String amountused) {
		this.amountused = amountused;
	}


	public String getAvailableamount() {
		return availableamount;
	}


	public void setAvailableamount(String availableamount) {
		this.availableamount = availableamount;
	}


	public String getCreditdate() {
		return creditdate;
	}


	public void setCreditdate(String creditdate) {
		this.creditdate = creditdate;
	}


	@Override
	public String toString() {
		return "CarddetialsDao [cardid=" + cardid + ", cardnumber=" + cardnumber + ", customerid=" + customerid
				+ ", cardtype=" + cardtype + ", totallimit=" + totallimit + ", amountused=" + amountused
				+ ", availableamount=" + availableamount + ", creditdate=" + creditdate + "]";
	}


	public CarddetialsDao(int cardid, int cardnumber, int customerid, String cardtype, String totallimit,
			String amountused, String availableamount, String creditdate) {
		super();
		this.cardid = cardid;
		this.cardnumber = cardnumber;
		this.customerid = customerid;
		this.cardtype = cardtype;
		this.totallimit = totallimit;
		this.amountused = amountused;
		this.availableamount = availableamount;
		this.creditdate = creditdate;
	}


	public CarddetialsDao() {
		super();
		
	}
	
	
	
	
	

}

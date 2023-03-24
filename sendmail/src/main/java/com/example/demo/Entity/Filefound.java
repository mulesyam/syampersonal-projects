package com.example.demo.Entity;

import org.springframework.core.type.filter.AbstractClassTestingTypeFilter;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Filefound {
	@Id
	private int status;
	private String vinno;
	private String filename;
	private String orderdata;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getVinno() {
		return vinno;
	}
	public void setVinno(String vinno) {
		this.vinno = vinno;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getOrderdata() {
		return orderdata;
	}
	public void setOrderdata(String orderdata) {
		this.orderdata = orderdata;
	}
	


}

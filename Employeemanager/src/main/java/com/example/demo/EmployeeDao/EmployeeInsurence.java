package com.example.demo.EmployeeDao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "insurance")
public class EmployeeInsurence {
	
	
	@Id
	
	@Column(name="empid")
	private int empid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="sex")
	private String sex;
	
	@Column(name="dateofbirth")
	private String dateofbirth;
	
	@Column(name="age")
	private String age;

	@Column(name="email")
	private String email;

	@Column(name="bankaccountno")
	private String bankaccountno;
	
	@Column(name="martialstatus")
	private String martialstatus;

	@Column(name="medicalcategory")
	private String medicalcategory;
	

	@Column(name="effectivedate")
	private String effectivedate;
	
	
	@Column(name="terminationdate")
	private String terminationdate;


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getDateofbirth() {
		return dateofbirth;
	}


	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getBankaccountno() {
		return bankaccountno;
	}


	public void setBankaccountno(String bankaccountno) {
		this.bankaccountno = bankaccountno;
	}


	public String getMartialstatus() {
		return martialstatus;
	}


	public void setMartialstatus(String martialstatus) {
		this.martialstatus = martialstatus;
	}


	public String getMedicalcategory() {
		return medicalcategory;
	}


	public void setMedicalcategory(String medicalcategory) {
		this.medicalcategory = medicalcategory;
	}


	public String getEffectivedate() {
		return effectivedate;
	}


	public void setEffectivedate(String effectivedate) {
		this.effectivedate = effectivedate;
	}


	public String getTerminatondate() {
		return terminationdate;
	}


	public void setTerminatondate(String terminatondate) {
		this.terminationdate = terminatondate;
	}


	@Override
	public String toString() {
		return "EmployeeInsurence [empid=" + empid + ", name=" + name + ", contact=" + contact + ", sex=" + sex
				+ ", dateofbirth=" + dateofbirth + ", age=" + age + ", email=" + email + ", bankaccountno="
				+ bankaccountno + ", martialstatus=" + martialstatus + ", medicalcategory=" + medicalcategory
				+ ", effectivedate=" + effectivedate + ", terminationdate=" + terminationdate + "]";
	}


	public EmployeeInsurence(int empid, String name, String contact, String sex, String dateofbirth, String age,
			String email, String bankaccountno, String martialstatus, String medicalcategory, String effectivedate,
			String terminatondate) {
		super();
		this.empid = empid;
		this.name = name;
		this.contact = contact;
		this.sex = sex;
		this.dateofbirth = dateofbirth;
		this.age = age;
		this.email = email;
		this.bankaccountno = bankaccountno;
		this.martialstatus = martialstatus;
		this.medicalcategory = medicalcategory;
		this.effectivedate = effectivedate;
		this.terminationdate = terminatondate;
	}


	public EmployeeInsurence() {
		super();
	
	}


}

package com.example.demo.EmployeeDao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeepolicy")
public class Insurencepolicy {
	
	@Id
	@Column(name="name")
	private String name;

    @Column(name="dateofbirth")
	private String dateofbirth;
    
    @Column(name="email")
	private String email;
    
    @Column(name="mobilenumber")
	private String mobilenumber;
    
    @Column(name="gender")
  	private String gender;
    
    @Column(name="age")
  	private String age;
    
    @Column(name="empid")
  	private int  empid;
    
    @Column(name="issueddate")
  	private String issueddate;
    
    @Column(name="expireddate")
  	private String expireddate;
    
    @Column(name="medicialstate")
  	private String medicialstate;
    
    @Column(name="marragestate")
  	private String marragestate;
    
    @Column(name="ifsc")
  	private String ifsc;
    
    @Column(name="fathername")
  	private String fathername;
    
    @Column(name="fatherage")
  	private String fatherage;
    
    @Column(name="fatherdateofbirth")
  	private String fatherdateofbirth;
    
    @Column(name="mothername")
  	private String mothername;
    
    @Column(name="motherage")
  	private String motherage;
    
    @Column(name="motherdateofbirth")
  	private String motherdateofbirth;
    

    @Column(name="childname")
  	private String childname;
    
    @Column(name="childage")
  	private String childage;
    
    @Column(name="childgender")
  	private String childgender;
    
    
    @Column(name="wifename")
  	private String wifename;
    
    @Column(name="wifeage")
  	private String wifeage;
    
    @Column(name="wifedateofbirth")
  	private String wifedateofbirth;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getIssueddate() {
		return issueddate;
	}

	public void setIssueddate(String issueddate) {
		this.issueddate = issueddate;
	}

	public String getExpireddate() {
		return expireddate;
	}

	public void setExpireddate(String expireddate) {
		this.expireddate = expireddate;
	}

	public String getMedicialstate() {
		return medicialstate;
	}

	public void setMedicialstate(String medicialstate) {
		this.medicialstate = medicialstate;
	}

	public String getMarragestate() {
		return marragestate;
	}

	public void setMarragestate(String marragestate) {
		this.marragestate = marragestate;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getFatherage() {
		return fatherage;
	}

	public void setFatherage(String fatherage) {
		this.fatherage = fatherage;
	}

	public String getFatherdateofbirth() {
		return fatherdateofbirth;
	}

	public void setFatherdateofbirth(String fatherdateofbirth) {
		this.fatherdateofbirth = fatherdateofbirth;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public String getMotherage() {
		return motherage;
	}

	public void setMotherage(String motherage) {
		this.motherage = motherage;
	}

	public String getMotherdateofbirth() {
		return motherdateofbirth;
	}

	public void setMotherdateofbirth(String motherdateofbirth) {
		this.motherdateofbirth = motherdateofbirth;
	}

	public String getChildname() {
		return childname;
	}

	public void setChildname(String childname) {
		this.childname = childname;
	}

	public String getChildage() {
		return childage;
	}

	public void setChildage(String childage) {
		this.childage = childage;
	}

	public String getChildgender() {
		return childgender;
	}

	public void setChildgender(String childgender) {
		this.childgender = childgender;
	}

	public String getWifename() {
		return wifename;
	}

	public void setWifename(String wifename) {
		this.wifename = wifename;
	}

	public String getWifeage() {
		return wifeage;
	}

	public void setWifeage(String wifeage) {
		this.wifeage = wifeage;
	}

	public String getWifedateofbirth() {
		return wifedateofbirth;
	}

	public void setWifedateofbirth(String wifedateofbirth) {
		this.wifedateofbirth = wifedateofbirth;
	}

	@Override
	public String toString() {
		return "Insurencepolicy [name=" + name + ", dateofbirth=" + dateofbirth + ", email=" + email + ", mobilenumber="
				+ mobilenumber + ", gender=" + gender + ", age=" + age + ", empid=" + empid + ", issueddate="
				+ issueddate + ", expireddate=" + expireddate + ", medicialstate=" + medicialstate + ", marragestate="
				+ marragestate + ", ifsc=" + ifsc + ", fathername=" + fathername + ", fatherage=" + fatherage
				+ ", fatherdateofbirth=" + fatherdateofbirth + ", mothername=" + mothername + ", motherage=" + motherage
				+ ", motherdateofbirth=" + motherdateofbirth + ", childname=" + childname + ", childage=" + childage
				+ ", childgender=" + childgender + ", wifename=" + wifename + ", wifeage=" + wifeage
				+ ", wifedateofbirth=" + wifedateofbirth + "]";
	}

	public Insurencepolicy(String name, String dateofbirth, String email, String mobilenumber, String gender, String age,
			int empid, String issueddate, String expireddate, String medicialstate, String marragestate, String ifsc,
			String fathername, String fatherage, String fatherdateofbirth, String mothername, String motherage,
			String motherdateofbirth, String childname, String childage, String childgender, String wifename,
			String wifeage, String wifedateofbirth) {
		super();
		this.name = name;
		this.dateofbirth = dateofbirth;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
		this.age = age;
		this.empid = empid;
		this.issueddate = issueddate;
		this.expireddate = expireddate;
		this.medicialstate = medicialstate;
		this.marragestate = marragestate;
		this.ifsc = ifsc;
		this.fathername = fathername;
		this.fatherage = fatherage;
		this.fatherdateofbirth = fatherdateofbirth;
		this.mothername = mothername;
		this.motherage = motherage;
		this.motherdateofbirth = motherdateofbirth;
		this.childname = childname;
		this.childage = childage;
		this.childgender = childgender;
		this.wifename = wifename;
		this.wifeage = wifeage;
		this.wifedateofbirth = wifedateofbirth;
	}

	public Insurencepolicy() {
		super();

	}
    
	
   
}
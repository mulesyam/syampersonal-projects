package com.example.demo.EmployeeDao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="dependent")
public class DependentDao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="empid")
	private int empid;
	
	@Column(name="dependentname")
	private String dependentname;
	
	
	@Column(name="gender")
	private String gender;
	
	
	@Column(name="birth")
	private String birth;
	
	
	@Column(name="relationship")
	private String relationship;
	
	@Column(name="effectivedate1")
	private String effectivedate1;
	
	
	@Column(name="terminationdate")
	private String terminationdate1;


	public int getEmpid() {
		return empid;
	}


	public void setEmpid1(int empid) {
		this.empid = empid;
	}


	public String getDependentname() {
		return dependentname;
	}


	public void setDependentname(String dependentname) {
		this.dependentname = dependentname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public String getRelationship() {
		return relationship;
	}


	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}


	public String getEffectivedate1() {
		return effectivedate1;
	}


	public void setEffectivedate1(String effectivedate1) {
		this.effectivedate1 = effectivedate1;
	}


	public String getTerminationdate1() {
		return terminationdate1;
	}


	public void setTerminationdate1(String terminationdate1) {
		this.terminationdate1 = terminationdate1;
	}


	@Override
	public String toString() {
		return "DependentDao [empid=" + empid + ", dependentname=" + dependentname + ", gender=" + gender + ", birth="
				+ birth + ", relationship=" + relationship + ", effectivedate1=" + effectivedate1
				+ ", terminationdate1=" + terminationdate1 + "]";
	}


	public DependentDao(int empid, String dependentname, String gender, String birth, String relationship,
			String effectivedate1, String terminationdate1) {
		super();
		this.empid = empid;
		this.dependentname = dependentname;
		this.gender = gender;
		this.birth = birth;
		this.relationship = relationship;
		this.effectivedate1 = effectivedate1;
		this.terminationdate1 = terminationdate1;
	}


	public DependentDao() {
		super();
	
	}
	
	
	
	
}

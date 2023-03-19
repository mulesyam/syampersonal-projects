package com.example.demo.EmployeeDao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "profile")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="empid")
	private int empid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="dateofbirth")
	private String dateofbirth;
	
	@Column(name="dateofjoining")
	private String dateofjoining;
	
	@Column(name="experience")
	private String experience;
	
	@Column(name="team")
	private String team;
	
	@Column(name="email")
	private String email;
	
	@Column(name="pan")
	private String pan;
	
	@Column(name="desigination")
	private String desigination;
	
	@Column(name="reportingmanager")
	private String reportingmanager;
	
	@Column(name="bloodgroup")
	private String bloodgroup;
	
	@Column(name="country")
	private String country;
	
	@Column(name="address")
	private String address;
	
	@Column(name="addhar")
	private String addhar;
	
	
	
	@Column(name="image")
	private String image;
	
	
	
	public String getDateofjoining() {
		return dateofjoining;
	}
	public void setDateofjoining(String dateofjoining) {
		this.dateofjoining = dateofjoining;
	}
	
	
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getDateofjoinin() {
		return dateofjoining;
	}
	public void setDateofjoinin(String dateofjoining) {
		this.dateofjoining = dateofjoining;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getDesigination() {
		return desigination;
	}
	public void setDesigination(String desigination) {
		this.desigination = desigination;
	}
	public String getReportingmanager() {
		return reportingmanager;
	}
	public void setReportingmanager(String reportingmanager) {
		this.reportingmanager = reportingmanager;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddhar() {
		return addhar;
	}
	public void setAddhar(String addhar) {
		this.addhar = addhar;
	}
	
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", contact=" + contact + ", gender=" + gender
				+ ", dateofbirth=" + dateofbirth + ", dateofjoining=" + dateofjoining + ", experience=" + experience
				+ ", team=" + team + ", email=" + email + ", pan=" + pan + ", desigination=" + desigination
				+ ", reportingmanager=" + reportingmanager + ", bloodgroup=" + bloodgroup + ", country=" + country
				+ ", address=" + address + ", addhar=" + addhar + ", image=" + image + "]";
	}
	public Employee() {
		super();
		
	}
	
	
	}
	
	
	

	



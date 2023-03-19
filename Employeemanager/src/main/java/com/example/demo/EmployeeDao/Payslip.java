package com.example.demo.EmployeeDao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "payslip")
public class Payslip {

	@Id
	@Column(name= "empid")
	private int empid;
	
	@Column(name= "name")
	private String name;
	
	@Column(name= "designation")
	private String designation;
	
	@Column(name= "department")
	private String department;
	
	@Column(name= "bankname")
	private String bankname;
	
	@Column(name= "accountno")
	private String accountno;
	
	@Column(name= "basicsalary")
	private String basicsalary;
	
	@Column(name= "houserentallowances")
	private String houserentallowances;
	
	@Column(name= "medicalallowances")
	private String medicalallowances;
	
	@Column(name= "specialallowances")
	private String specialallowances;
	
	@Column(name= "conveyanceallowances")
	private String conveyanceallowances;
	
	@Column(name= "pf")
	private String pf;
	
	@Column(name= "healthinsurance")
	private String healthinsurance;
	
	@Column(name= "professionaltax")
	private String professionaltax;
	
	@Column(name= "grosssalary")
	private String grosssalary;
	
	@Column(name= "netpay")
	private String netpay;
	
	
	@Column(name= "pfno")
	private String pfno;
	
	
	@Column(name= "uanno")
	private String uanno;
	
	@Column(name= "paymenttype")
	private String paymenttype;
	
	
	@Column(name= "email")
	private String email;
	
	
	@Column(name= "branch")
	private String branch;
	
	@Column(name= "paiddays")
	private String paiddays;
	
	@Column(name= "absent")
	private String absent;
	
	@Column(name = "month")
	private String month;
	
	
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getPfno() {
		return pfno;
	}
	public void setPfno(String pfno) {
		this.pfno = pfno;
	}
	public String getUanno() {
		return uanno;
	}
	public void setUanno(String uanno) {
		this.uanno = uanno;
	}
	public String getPaymenttype() {
		return paymenttype;
	}
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getTotaldays() {
		return totaldays;
	}
	public void setTotaldays(String totaldays) {
		this.totaldays = totaldays;
	}
	private String totaldays;
	
	
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(String basicsalary) {
		this.basicsalary = basicsalary;
	}
	public String getHouserentallowances() {
		return houserentallowances;
	}
	public void setHouserentallowances(String houserentallowances) {
		this.houserentallowances = houserentallowances;
	}
	public String getMedicalallowances() {
		return medicalallowances;
	}
	public void setMedicalallowances(String medicalallowances) {
		this.medicalallowances = medicalallowances;
	}
	public String getSpecialallowances() {
		return specialallowances;
	}
	public void setSpecialallowances(String specialallowances) {
		this.specialallowances = specialallowances;
	}
	public String getConveyanceallowances() {
		return conveyanceallowances;
	}
	public void setConveyanceallowances(String conveyanceallowances) {
		this.conveyanceallowances = conveyanceallowances;
	}
	public String getPf() {
		return pf;
	}
	public void setPf(String pf) {
		this.pf = pf;
	}
	public String getHealthinsurance() {
		return healthinsurance;
	}
	public void setHealthinsurance(String healthinsurance) {
		this.healthinsurance = healthinsurance;
	}
	public String getProfessionaltax() {
		return professionaltax;
	}
	public void setProfessionaltax(String professionaltax) {
		this.professionaltax = professionaltax;
	}
	public String getGrosssalary() {
		return grosssalary;
	}
	public void setGrosssalary(String grosssalary) {
		this.grosssalary = grosssalary;
	}
	public String getNetpay() {
		return netpay;
	}
	public void setNetpay(String netpay) {
		this.netpay = netpay;
	}
	
	public String getPaiddays() {
		return paiddays;
	}
	public void setPaiddays(String paiddays) {
		this.paiddays = paiddays;
	}
	public String getAbsent() {
		return absent;
	}
	public void setAbsent(String absent) {
		this.absent = absent;
	}
	
	@Override
	public String toString() {
		return "Payslip [empid=" + empid + ", name=" + name + ", designation=" + designation + ", department="
				+ department + ", bankname=" + bankname + ", accountno=" + accountno + ", basicsalary=" + basicsalary
				+ ", houserentallowances=" + houserentallowances + ", medicalallowances=" + medicalallowances
				+ ", specialallowances=" + specialallowances + ", conveyanceallowances=" + conveyanceallowances
				+ ", pf=" + pf + ", healthinsurance=" + healthinsurance + ", professionaltax=" + professionaltax
				+ ", grosssalary=" + grosssalary + ", netpay=" + netpay + ", pfno=" + pfno + ", uanno=" + uanno
				+ ", paymenttype=" + paymenttype + ", email=" + email + ", branch=" + branch + ", paiddays=" + paiddays
				+ ", absent=" + absent + ", totaldays=" + totaldays + "]";
	}
	public Payslip(int empid, String name, String designation, String department, String bankname, String accountno,
			String basicsalary, String houserentallowances, String medicalallowances, String specialallowances,
			String conveyanceallowances, String pf, String healthinsurance, String professionaltax, String grosssalary,
			String netpay, String pfno, String uanno, String paymenttype, String email, String branch, String paiddays,
			String absent, String totaldays) {
		super();
		this.empid = empid;
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.bankname = bankname;
		this.accountno = accountno;
		this.basicsalary = basicsalary;
		this.houserentallowances = houserentallowances;
		this.medicalallowances = medicalallowances;
		this.specialallowances = specialallowances;
		this.conveyanceallowances = conveyanceallowances;
		this.pf = pf;
		this.healthinsurance = healthinsurance;
		this.professionaltax = professionaltax;
		this.grosssalary = grosssalary;
		this.netpay = netpay;
		this.pfno = pfno;
		this.uanno = uanno;
		this.paymenttype = paymenttype;
		this.email = email;
		this.branch = branch;
		this.paiddays = paiddays;
		this.absent = absent;
		this.totaldays = totaldays;
	}
	public Payslip() {
		super();
		
	}
	

}

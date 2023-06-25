package com.example.demo.EmployeeDao;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity
public class EmployeeDao {
	@Id
	@NotNull
	@Column
	private int empid;
	
	@Column
	@NotNull
	@NotBlank
    @Size(min = 3, max = 10)

	
	private String empname;
	@Column
	@NonNull
	@Size(min = 6, max = 10)
	private String phone;
	@Column
	@NonNull 
    @NotBlank
    @Email(message = "Please enter a valid e-mail address")
	private String email;
	@Column
	@NonNull
	 @Size(min = 3, max = 9)
	private String department;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "EmployeeDao [empid=" + empid + ", empname=" + empname + ", phone=" + phone + ", email=" + email
				+ ", department=" + department + "]";
	}
	public static void deleteById(int empId1) {
		System.out.println("delete Sucussfully");
	}
		
		public static void insertedById(int empId1) {
			System.out.println("inserted Sucussfully");
			
		
	}
     
		public static void updateById(int empId1) {
			System.out.println("update Sucussfully");
}
}


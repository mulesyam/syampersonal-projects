package com.example.demo.EmployeeDao;


import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;
	     
		@Entity
		@Table(name="user")
		
		public class User  {
		     
		    @Id
		    @Column(name= "empid")
		    private int empid;
		    
		    
		    @Column(name="email", nullable = false,  length = 45)
		    private String email;
		     
		    @Column(nullable = false, length = 64)
		    private String password;
		     
		    @Column(name = "first_name", nullable = false, length = 20)
		    private String firstName;
		     
		    @Column(name = "last_name", nullable = false, length = 20)
		    private String lastName;
		    
		    @Column (name = "role", nullable = false, length = 20)
		    private String role;
			
			  public String getRole() {
				return role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			@OneToOne
			  
			  @JoinColumn(name="empid") 
			  private Employee employee;
			 

			public String getEmail() {
				return email;
			}

			public int getEmpid() {
				return empid;
			}

			public void setEmpid(int empid) {
				this.empid = empid;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getFirstName() {
				return firstName;
			}

			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}

			public String getLastName() {
				return lastName;
			}

			public void setLastName(String lastName) {
				this.lastName = lastName;
			}

			

			@Override
			public String toString() {
				return "User [empid=" + empid + ", email=" + email + ", password=" + password + ", firstName="
						+ firstName + ", lastName=" + lastName + ", role=" + role + ", employee=" + employee + "]";
			}

			public User(int empid, String email, String password, String firstName, String lastName, String role,
					Employee employee) {
				super();
				this.empid = empid;
				this.email = email;
				this.password = password;
				this.firstName = firstName;
				this.lastName = lastName;
				this.role = role;
				this.employee = employee;
			}

			public User() {
			
			}

			
			  public Employee getEmployee() { return employee; }
			 
			 public void setEmployee(Employee employee) { this.employee = employee; }
			 
			

	
}
		
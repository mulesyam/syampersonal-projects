package com.example.demo.EmployeeService;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.EmployeeDao.Employee;
import com.example.demo.EmployeeDao.EmployeeInsurence;
import com.example.demo.EmployeeDao.LeaveManagement;
import com.example.demo.EmployeeDao.Leavestatus;
import com.example.demo.EmployeeDao.Login;
import com.example.demo.EmployeeDao.Payslip;
import com.example.demo.EmployeeDao.User;
import com.example.demo.Repository.AllowInsurance;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Repository.LeaveRepository;
import com.example.demo.Repository.UserRepository;

@Service
public class EmployeeService {
	



	@Autowired
	UserRepository emprepo;

	@Autowired
	EmployeeRepository repo;

	@Autowired
	LeaveRepository leaverepo;
	@Autowired
	AllowInsurance allowrepo;
	
	
	
	public void save(User user) {
		user.setRole("user");
		emprepo.save(user);

	}

	public User findprofile(int empid, String password) {
		User user = emprepo.findData(empid, password);
		return user;

	}

	public User findManager(int empid, String password, String role) {

		User user1 = emprepo.findRole(empid, password);
		return user1;
	}

	public List<LeaveManagement> viewleaves() {

		return leaverepo.viewleaves();
	}
	
	public Employee updateEmployeeDetails1(int empid, Employee emp) {
		System.out.println(empid);
		Employee emp1 = repo.getById(empid);
		emp1.setName(emp.getName());
		emp1.setAddress(emp.getAddress());
		emp1.setContact(emp.getContact());
		emp1.setEmail(emp.getEmail());
		return repo.save(emp1);
		
	}

	public User findprofile1(int empid, String password) {
		User user = emprepo.findRole(empid, password);
		return user;

	}

	public Leavestatus getLeaveDetailsOnId(int empid) {

		return leaverepo.findOne(empid);
	}
	
	public void profiledisplay(Employee emp) {
		repo.save(emp);
		
	}

	
		public void uploadfile(int empid, MultipartFile file) throws IllegalStateException, IOException
		{
			file.transferTo(new File("C:\\Users\\prasanna_mule\\Downloads\\importphotoes" +file.getOriginalFilename()));
			String filename=file.getOriginalFilename();
			Path pathToImage=Paths.get("C:\\Users\\prasanna_mule\\Downloads\\importphotoes" +filename);
			byte[] imageBytes = Files.readAllBytes(pathToImage);
			String base64EncodedImageBytes = Base64.getEncoder().encodeToString(imageBytes);
			 //System.out.println(base64EncodedImageBytes);
			Employee emp =new Employee();
			emp=repo.getById(empid);
             emp.setImage(base64EncodedImageBytes);
             repo.save(emp);
			 
		}

		
	}

	


	/*public ByteArrayInputStream convertHtmlToPdf(String contentToGenerate) {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Payslip payslip = new Payslip();
        payslip.setDocumentFromString(contentToGenerate);
        payslip.getEmpid();
        payslip.createPDF(outputStream, false);
        payslip.finishPDF();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        return inputStream;
    
				*/

	
	
	

//	public void addpolicy(EmployeeInsurence insu) {
//		allowrepo.save(insu);
//		
//	}

//	public void updateLeaveDetails(Leavestatus leaveDetails) {
//		
//		 leaverepo.save(leaveDetails);
//	}
//	


//
//	public List<LeaveManagement> viewleaves() {
//
//      LeaveManagement leave = leaverepo.viewleaves();
//		return (List<LeaveManagement>) leave;
//	}

//	public Employee updateEmployeeDetails1(Employee emp) {
//		
//		    int empid = emp.getEmpid();
//			 Employee emp1 = repo.getById(empid);
//			
//			 emp1.setEmail(emp.getEmail()); 
//			 emp1.setContact(emp.getContact());
//			 emp1.setBloodgroup(emp.getBloodgroup());
//			 emp1.setAddress(emp.getAddress());
//			 return repo.save(emp1); 
//			 }
//	
//		

//	public User findRole(String role) {
//		
//		User user = emprepo.getRole(role);
//		return user;
//
//		}

package com.example.demo.EmployeeService;

import java.util.List;

import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.EmployeeDao.DependentDao;
import com.example.demo.EmployeeDao.Employee;
import com.example.demo.EmployeeDao.EmployeeInsurence;
import com.example.demo.EmployeeDao.Insurencepolicy;
import com.example.demo.EmployeeDao.LeaveManagement;
import com.example.demo.EmployeeDao.Leavestatus;
import com.example.demo.Repository.AllowInsurance;
import com.example.demo.Repository.DependencyRepository;
import com.example.demo.Repository.InsuranceRepository;
import com.example.demo.Repository.LeaveRepository;
@Service
public class ManagementServices {
	@Autowired
	private  LeaveRepository emprepo;
	
	@Autowired
	InsuranceRepository repo;
	
	
	@Autowired
	AllowInsurance repo1;
	
	@Autowired
	DependencyRepository repository;

		public void insertdata(LeaveManagement  emp) {
		     emprepo.save(emp);	
		}

	
		



		public void updateleavestatus(LeaveManagement leavemanagement) {
			 Integer status = leavemanagement.getStatus();
			 int empid = leavemanagement.getEmpid();
			 LeaveManagement leave = emprepo.getById(empid);
			 leave.setStatus(leavemanagement.getStatus()); 
			
		}
		
		public void rejectstatus(LeaveManagement leaves)
		{
			Integer status = leaves.getStatus();
			int empid = leaves.getEmpid();
			LeaveManagement leave = emprepo.getById(empid);
			leave.setStatus(leaves.getStatus());
			
		}

		public void insertinsurance(Insurencepolicy insurance) {
			repo.save(insurance);
		}


		public void data(EmployeeInsurence empins) {
		 repo1.save(empins);	
			
		}
		public void inforamation(DependentDao emp) {
			repository.save(emp);
			
		}

		}

	
	


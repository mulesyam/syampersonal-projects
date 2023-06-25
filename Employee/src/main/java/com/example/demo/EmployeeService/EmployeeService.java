package com.example.demo.EmployeeService;

import java.security.PublicKey;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.EmployeeDao.EmployeeDao;
import com.example.demo.Repository.EmployeeRepository;

import antlr.collections.List;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository emprepo;
	public EmployeeDao insertData(EmployeeDao empdao)
	{
		return emprepo.save(empdao);
	
	}
	public EmployeeDao getEmployeeDao()
	{
		return (EmployeeDao) emprepo.findAll();
	}
	//get Single Employee  details
	public Optional<EmployeeDao>getEmployee(int empId){
		return emprepo.findById(empId);
	}
	
	
    // Delete operation
   public String deleteEmployeeById(int empId) {
	   Optional<EmployeeDao> empId1=emprepo.findById(empId);
	   if(empId1.isPresent()) {
		   emprepo.deleteById(empId);
		   return"employee is deleted successfully:"+empId1;
	   }
	   else {
		   return "Employee is doesnot exists"+empId1;
	   }	   
  }
   //Update employee 
   @SuppressWarnings("deprecation")
public EmployeeDao updateEmployeeDetails(EmployeeDao emp)
   {
	   int empid1=emp.getEmpid();
	   EmployeeDao emp1=emprepo.getById(empid1);
			   emp1.setDepartment(emp.getDepartment());
	   emp1.setEmail(emp.getEmail());
	   emp1.setEmpname(emp.getEmpname());
	   emp1.setPhone(emp.getPhone());
	   return emprepo.save(emp1);
   }
//public  deleteEmployeeById(EmployeeDao emp) {
//	// TODO Auto-generated method stub
	
}

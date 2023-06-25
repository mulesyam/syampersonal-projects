package com.example.demo.Controller;

import java.security.PublicKey;
import java.util.Optional;

import javax.validation.Valid;

import org.hibernate.engine.query.spi.ReturnMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.EmployeeDao.EmployeeDao;
import com.example.demo.EmployeeService.EmployeeService;
import com.example.demo.Repository.EmployeeRepository;

import antlr.collections.List;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService empservice;
	@Autowired
	EmployeeRepository repo;
	
	@PostMapping("/create")
    public String insertData(EmployeeDao emp) {
	          empservice.insertData(emp);
	          return "home";
	}
	
//@PostMapping("/create")
//	public EmployeeDao insert(@RequestBody EmployeeDao emp)
//	{
//		return empservice.insertData(emp);
//	}
	@PostMapping("/retrievebyid")
	public ModelAndView getById(@RequestParam("empid") int empid)
	{
		ModelAndView mv=new ModelAndView("viewdata");
		EmployeeDao empdao=repo.findById(empid).orElse(null);
		mv.addObject("empdao", empdao);
		return mv;
		
		
		
	}
	
	@PostMapping("/retrievebydepartment")
	public ModelAndView getBydepartment(@RequestParam("department") String department)
	{
		ModelAndView mv=new ModelAndView("viewdata");
		EmployeeDao empdao=repo.findByDepartment(department);
		mv.addObject("empdao", empdao);
		return mv;
	
	}
	
	
	@PostMapping("/retrievebyemail")
	public ModelAndView getbyemail(@RequestParam("email")  String email)
	{
		ModelAndView mv=new ModelAndView("viewdata");
		EmployeeDao empdao=repo.findByEmail(email);
		mv.addObject("empdao",empdao);
		return mv;
	}
	
	@PostMapping("/retrievebyempname")
	public ModelAndView getbyname(@RequestParam("empname")  String empname)
	{
		ModelAndView mv=new ModelAndView("viewdata");
		EmployeeDao empdao=repo.findByEmpname(empname);
		mv.addObject("empdao",empdao);
		return mv;
	}
	
	
	@PostMapping("/retrievebyphone")
	public ModelAndView getbyphone(@RequestParam("phone")  String phone)
	{
		ModelAndView mv=new ModelAndView("viewdata");
		EmployeeDao empdao=repo.findByphone(phone);
		mv.addObject("empdao",empdao);
		return mv;
	}
	
		// Get mapping 
	@GetMapping("/{empId}")
	public Optional<EmployeeDao> getEmployee( @PathVariable Integer empId) {

	return empservice.getEmployee(empId);
	}
	
	
	
	@PostMapping("delete")
	public String deleteEmployeedetails(@RequestParam("empid") int empid){
	repo.deleteById(empid);
	return "home";
	}


	 @PostMapping("/update")
	 public String updateEmployeedetails( EmployeeDao emp)
	{
	 empservice.updateEmployeeDetails(emp);
	 return "home";
	 
	}

	}


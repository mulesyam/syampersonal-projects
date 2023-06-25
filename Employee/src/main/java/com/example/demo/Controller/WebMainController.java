package com.example.demo.Controller;



import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.EmployeeDao.EmployeeDao;
import com.example.demo.EmployeeService.EmployeeService;
import com.example.demo.Repository.EmployeeRepository;

@Controller

public class WebMainController implements WebMvcConfigurer{
	@Autowired
	EmployeeService empservice;
	private int emp;

		@RequestMapping("/Welcome2")
		public String Welcome() {
			System.out.println("Welcome to this page");
			return "Welcome2";
	}
	@RequestMapping("/home")
         public ModelAndView home() {
                 ModelAndView mv = new ModelAndView("home");
                 return mv;
	}
	

                 
                 @RequestMapping("/viewdata")
                 public ModelAndView viewdata() {
                         ModelAndView mv = new ModelAndView("viewdata");
                         return mv;
                 }
                        
                 @RequestMapping("/delete")
                 public ModelAndView delete() {
                         ModelAndView mv = new ModelAndView("delete");
                         return mv;
                 }

	@GetMapping("/empid")
	public String getEmployee(Integer empId) {

	empservice.getEmployee(empId);
	return "home";
	}
//
//@PostMapping("/delete")
//public String deleteEmployee(EmployeeDao emp) {
//	empservice.deleteEmployeeById(emp);
//	return "home";
//}
//	
	
}




	
	
	

	



package com.example.demo.Controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.management.relation.Role;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.apache.tomcat.util.net.TLSClientHelloExtractor;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.DependencyDescriptor;
import org.springframework.jdbc.support.incrementer.SybaseAnywhereMaxValueIncrementer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.EmployeeDao.DependentDao;
import com.example.demo.EmployeeDao.Employee;
import com.example.demo.EmployeeDao.EmployeeInsurence;
import com.example.demo.EmployeeDao.Insurencepolicy;
import com.example.demo.EmployeeDao.LeaveManagement;
import com.example.demo.EmployeeDao.Payslip;
import com.example.demo.EmployeeDao.Piechart;
import com.example.demo.EmployeeDao.User;
import com.example.demo.EmployeeService.EmployeeService;
import com.example.demo.EmployeeService.ManagementServices;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Repository.LeaveRepository;
import com.example.demo.Repository.PayslipRepository;
import com.example.demo.Repository.PiechartRepository;
import com.example.demo.Repository.UserRepository;


import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import net.bytebuddy.asm.Advice.Return;

@Controller
public class MainController {
		
	@Autowired
	EmployeeService userService;

	@Autowired
	EmployeeRepository repo;

	@Autowired
	UserRepository userRepository;

	@Autowired
	LeaveRepository repository;

	@Autowired
	ManagementServices service;

	@Autowired
	PayslipRepository payrepo;

	@Autowired
	PiechartRepository pierepo;

	@GetMapping("/leaveform")
	public String getform() {
		return "leaves";
	}

	@PostMapping("/applyleave")
	public String createEmployee(LeaveManagement emp) {
		System.out.println("leaveform" + emp.getEmpid());
		service.insertdata(emp);
		System.out.println(emp);
		return "leaves";

	}
	
	
	
	@GetMapping("/Employeeinsurance")
	public String company() {
		return "Insurance";
	}
	@GetMapping("/Dbl")
	public String set() {
		return "DBL";
	}

	@PostMapping("/get")
	public String getEmployee(EmployeeInsurence emp) {
		System.out.println("get" + emp.getEmpid());
		service.data(emp);
		System.out.println(emp);
		return "Insurance";

	}
	
	
	@GetMapping("/Empoyeedependency")
	public String getadd() {
		return "Dependency";
	}

	@PostMapping("/post")
	public String get(DependentDao emp) {
		System.out.println("get" + emp.getEmpid());
		service.inforamation(emp);
		System.out.println(emp);
		return "Dependency";

	}
	

	
	@GetMapping("/insurence")
	public String getinsurency() {
		return "adddependency";
	}
	@PostMapping("/adddependency")
	public String createEmployee(Insurencepolicy insurance) {
		//System.out.println("adddependency" + emp.getEmpid());
		service.insertinsurance(insurance);
		//System.out.println(emp);
		return "adddependency";

	}
	


	


	
	
	@PostMapping("/register")
	public String insertData(User user) {
		userService.save(user);
		return "login";
	}

	@GetMapping("/log")
	public String demo(User user) {
		return "log";

	}

	@PostMapping("/login")
	public String getUserByEmpidPassword(@RequestParam("empid") int empid, @RequestParam("password") String password,
			HttpServletResponse response, HttpServletRequest request) {
		User user = userRepository.findData(empid, password);
		String empid1 = String.valueOf(user.getEmpid());
		Cookie cookie = new Cookie("empid", empid1);
		response.addCookie(cookie);
		String role1 = String.valueOf(user.getRole());
		Cookie role = new Cookie("role1", role1);
		response.addCookie(role);
		request.setAttribute("user", user);
		if (user == null) {
			return "log";
		} else {
			return "dashboard";
		}
	}
	

	@GetMapping("/profiles")
	public ModelAndView getByEmpid(@CookieValue(name = "empid") String empid1) {
		int empid = Integer.parseInt(empid1);
		ModelAndView mv = new ModelAndView("profile");
		Employee emp = repo.findByEmpid(empid);
		mv.addObject("emp", emp);
		System.out.println("emp" + emp);
//			mv.addObject("emp", emp);
//			System.out.println(emp);
		return mv;
	}
	
	


	@GetMapping("/payslips")
	public ModelAndView getData(@CookieValue(name = "empid") String empid1) {

		int empid = Integer.parseInt(empid1);
		ModelAndView mv = new ModelAndView("payslips");
		Payslip ps = payrepo.findData(empid);
		mv.addObject("ps", ps);
		
		return mv;

	}
	


	@GetMapping("/piecharts")
	public ModelAndView getPie(@CookieValue(name = "empid") String empid2) {

		int empid = Integer.parseInt(empid2);
		ModelAndView mv = new ModelAndView("piechart");
		Piechart pc = pierepo.findPie(empid);
		mv.addObject("pc", pc);
		return mv;
	}

	
	@GetMapping("/leaveslist")
	public String viewdata(Model model) {
		List<LeaveManagement> list = userService.viewleaves();
		model.addAttribute("list", list);
		return "leaveslist";
	}

	@GetMapping("/approve/{empid}")
	public String approveleave(@PathVariable int empid, Model model) {
		LeaveManagement leaveManagement = repository.findById(empid);
		leaveManagement.setStatus(1);
		repository.save(leaveManagement);
		System.out.println(leaveManagement);
		Piechart piechart = pierepo.getById(empid);
		int add = piechart.getLeaves();
		piechart.setLeaves(add+1);
		int sub = piechart.getWorkingdays();
		piechart.setWorkingdays(sub-1);
		pierepo.save(piechart);
		List<LeaveManagement> list = userService.viewleaves();
		model.addAttribute("list", list);
		return "leaveslist";

	}

	@GetMapping("/reject/{empid}")
	public String rejectleave(@PathVariable int empid, Model model) {
		LeaveManagement leave = repository.findById(empid);
		leave.setStatus(0);
		repository.save(leave);
		List<LeaveManagement> list = userService.viewleaves();
		model.addAttribute("list", list);
		return "leaveslist";

	}
	
	@GetMapping("/payslips/{month}")
	public ModelAndView getData(@CookieValue(name = "empid") String empid1, @PathVariable String month) {

		int empid = Integer.parseInt(empid1);
		ModelAndView mv = new ModelAndView("payslips");
		Payslip ps = payrepo.findData(empid);
		mv.addObject("ps", ps);
		return mv;

	}
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {

		return "signupform";
	}
   
	
	
	@GetMapping("/templets")
	public String showpdfForm(Model model) {

		return "templets";
	}
	
	@PostMapping("/signupform")
	public String show(Model model) {
		return "/login";
	}

	@GetMapping("/login")
	public String showlogin(Model model) {

		return "login";
	}

	@GetMapping("/manager")
	public String manag(Model model) {

		return "manager";
	}

	@GetMapping("/dashboard")
	public String dashboard(Model model) {

		return "dashboard";
	}

	@GetMapping("/Aboutus")
	public String aboutus(Model model) {
		return "Aboutus";
	}

	@GetMapping("/home")
	public String home(Model model) {
		return "dashboard";
	}

	@GetMapping("/Hrpolices")
	public String policy(Model model) {
		return "Hrpolices";
	}

	@GetMapping("/home1")
	public String home1(Model model) {
		return "home";
	}
	@GetMapping("/Adddependency")
	public String dependency() {
		return "adddependency";
	}
		
	
		@PostMapping("/update")
	    public String updateEmployee(@CookieValue(name = "empid") String empid1, Employee emp) {
			int empid=Integer.parseInt(empid1);
	     userService.updateEmployeeDetails1(empid,emp); 
		 return "profile"; 
		 }
		
		@PostMapping("/profilepic")
		public String uploadImage(@CookieValue(name = "empid") int empid, @RequestParam("image") MultipartFile file,
				HttpServletResponse response) throws IllegalStateException, IOException {

			userService.uploadfile(empid, file);
			return "profile";

		}
		
		
		
		
		
}


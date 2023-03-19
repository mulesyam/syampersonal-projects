package com.example.demo.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class WebMainController implements WebMvcConfigurer{
	   
//          @RequestMapping("/profile")
//         public ModelAndView viewdata() {
//                  ModelAndView mv = new ModelAndView("profile");
//                 return mv;
//        }
          
          @RequestMapping("/leaves")
          public ModelAndView leaves() {
                   ModelAndView mv = new ModelAndView("leaves");
                  return mv;
         }
          
          @RequestMapping("/home")
          public ModelAndView techi() {
                   ModelAndView mv = new ModelAndView("home");
                  return mv;
         }
          
          
          @RequestMapping("/dashboard")
          public ModelAndView techi3() {
                   ModelAndView mv = new ModelAndView("dashboard");
                  return mv;
                  }		
         

@RequestMapping("/payroll")
public ModelAndView payroll() {
         ModelAndView mv = new ModelAndView("payroll");
        return mv;
        }		

}







	
	
	

	



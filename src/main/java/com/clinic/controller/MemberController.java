package com.clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import com.hibernate.persistence.HibernatePersistence;
import org.hibernate.Session;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.clinic.model.Member;

@Controller
public class MemberController {

   @RequestMapping(value = "/member", method = RequestMethod.GET)
   public ModelAndView member() {
      return new ModelAndView("register", "member", new Member());
   }
   
   @RequestMapping(value = "/addMember", method = RequestMethod.POST)
   public String addMember(@ModelAttribute("member")Member member, 
   ModelMap model) {
	  Session session = HibernatePersistence.getSessionFactory().openSession();
	  session.beginTransaction();
	  String hashedPassword = hashPassword(member.getPassword(), member.getRepassword());
	  System.out.println(hashedPassword);
      model.addAttribute("firstName", member.getFirstName());
      model.addAttribute("lastName", member.getLastName());
      model.addAttribute("email", member.getEmail());
      model.addAttribute("password", member.getPassword());
      model.addAttribute("repassword", member.getRepassword());
	  	return "thanksRegistration";
   }
   public static String hashPassword(String password, String repassword){
	   if(password == repassword){
		   return "diffrent passowrds";
	   } else {
		   BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		   String hashedPassword = passwordEncoder.encode(password);
		   return hashedPassword;
	   }

   }
}

package com.clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import com.clinic.model.Member;

@Controller
public class MemberController {

   @RequestMapping(value = "/member", method = RequestMethod.GET)
   public ModelAndView member() {
      return new ModelAndView("Member", "command", new Member());
   }
   
   @RequestMapping(value = "/addMember", method = RequestMethod.POST)
   public String addMember(@ModelAttribute("SpringWeb")Member member, 
   ModelMap model) {
      model.addAttribute("name", member.getName());
      model.addAttribute("age", member.getAge());
      model.addAttribute("id", member.getId());
      
      return "result";
   }
}

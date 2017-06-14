package com.ooad.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import util.LoginStatus;

@Controller
public class TagsController {
	
	private LoginStatus loginStatus = LoginStatus.getInstance();
	
	   @RequestMapping(value = "/tags", method = RequestMethod.GET)
	   public String showPage(ModelMap model) {
		   
		   if (loginStatus.isLogin()) {
			   model.addAttribute("phoneNumber", loginStatus.getUserPhoneNumber());
			   return "tags";
		   }
		   else							return "redirect:login";
		   
	   }
	   
	   @RequestMapping(value = "/updateTags", method = RequestMethod.GET)
	   public String updateTags(ModelMap model) {

		   // TODO: update tags
		   
		   System.out.println("updating");
		   return "redirect:home";
		   
	   }
	
}

package com.ooad.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import util.LoginStatus;

@Controller
public class BookShelfController {
	
		private LoginStatus loginStatus = LoginStatus.getInstance();

	   @RequestMapping(value = "/bookShelf", method = RequestMethod.GET)
	   public String showPage(ModelMap model, @RequestParam("phoneNumber") String phoneNumber) {
		   if (loginStatus.isLogin()) {
			   System.out.println(phoneNumber);
			   model.addAttribute("phoneNumber", loginStatus.getUserPhoneNumber());
			   return "bookShelf";
		   }
		   else							return "redirect:login";
	   }
	
}

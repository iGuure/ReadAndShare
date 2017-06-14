package com.ooad.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import util.LoginStatus;

@Controller
public class SettingController {

	private LoginStatus loginStatus = LoginStatus.getInstance();
	
   @RequestMapping(value = "/setting", method = RequestMethod.GET)
   public String showPage(ModelMap model) {
	   if (loginStatus.isLogin()) {
		   model.addAttribute("phoneNumber", loginStatus.getUserPhoneNumber());
		   return "setting";
	   }
	   else							return "redirect:login";
   }

}

package com.ooad.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import model.LoginUser;
import model.SettingUser;
import util.DBConnection;
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
   
   @RequestMapping(value = "/settingUser", method = RequestMethod.POST)
   public String loginUser(@ModelAttribute("SpringWeb")SettingUser settingUser, RedirectAttributes redirectAttributes) {
	   String account = LoginStatus.getInstance().getUserPhoneNumber(); 

	   String name = settingUser.getName();
	   String gender = settingUser.getInputGender();
	   String email = settingUser.getEmail();
	   String we_chat = settingUser.getWe_chat();
	   String qq = settingUser.getQq();
	   String school = settingUser.getSchool();
	   String major = settingUser.getMajor();
	   String bio = settingUser.getBio();
	   
	   DBConnection.connSQL();
	   String update = "update user set name='" + name + "'"
			   + ", gender='" + gender + "'"
			   + ", email='" + email + "'"
			   + ", we_chat='" + we_chat + "'"
			   + ", qq='" + qq + "'"
			   + ", school='" + school + "'"
			   + ", major='" + major + "'"
			   + ", bio='" + bio + "'"
			   + "where account='" + account + "'";
	   DBConnection.updateSQL(update);
	   DBConnection.deconnSQL();

	   return "redirect:setting";
   }

}

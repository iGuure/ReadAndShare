package com.ooad.springmvc;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import model.LoginUser;
import model.RegisterUser;
import util.LoginStatus;

@Controller
public class LoginController{
	
	private LoginStatus loginStatus = LoginStatus.getInstance();

   @RequestMapping(value = "/login", method = RequestMethod.GET)
   public ModelAndView showPage(ModelMap model) {
      return new ModelAndView("login", "command", new LoginUser());
   }
   
   @RequestMapping(value = "/redirectToRegister", method = RequestMethod.GET)
   public String redirect() {
	   return "redirect:register";
   }

   @RequestMapping(value = "/loginUser", method = RequestMethod.POST)
   public String loginUser(@ModelAttribute("SpringWeb")LoginUser loginUser, RedirectAttributes redirectAttributes) {
	   
	   String phoneNumber = loginUser.getPhoneNumber();
	   String password = loginUser.getPassword();
	   
	   boolean result = true;
	   
	   // TODO: read from Table User
	   // TODO: set result
	   
	   if (result) {
		   
		   System.out.println("登陆成功！");
		   
		   loginStatus.setUserPhoneNumber(phoneNumber);
		   
		   boolean firstTimeLogin = true;
		   
		   // TODO: check if this user's tag list is null
		   // TODO: set firstTimeLogin
		   
		   if (firstTimeLogin)	return "redirect:tags";
		   else return "redirect:home";
		   
	   } else {
		   System.out.println("登陆失败！");
		   return "redirect:login";
	   }
      
   }
   
   @RequestMapping(value = "/unregister", method = RequestMethod.GET)
   public String unregister() {
	   loginStatus.setUserPhoneNumber(null);
	   return "redirect:login";
   }

}

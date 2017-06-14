package com.ooad.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.RegisterUser;

@Controller
public class RegisterController{

   @RequestMapping(value = "/register", method = RequestMethod.GET)
   public ModelAndView showPage(ModelMap model) {
      return new ModelAndView("register", "command", new RegisterUser());
   }

   @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
   public String registerUser(@ModelAttribute("SpringWeb")RegisterUser registerUser, 
   ModelMap model) {
	  
      String phoneNumber = registerUser.getPhoneNumber();
      String password1 = registerUser.getPassword1();
      String password2 = registerUser.getPassword2();
      
      if (password1.equals(password2)) {
    	  // TODO: add into Table User
    	  
    	  System.out.println("注册成功！");
          return "redirect:login";
      } else {
    	  System.out.println("两次输入的密码不一致！");
          return "redirect:register";
      }
      
   }
	
}

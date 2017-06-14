package com.ooad.springmvc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import util.DBConnection;
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
		   DBConnection.connSQL();
		   String insertSql = "insert into tag(tag"
		   		+ "_name) values('jiongcheng')";
		   Boolean resultSet = DBConnection.insertSQL(insertSql);
		   System.out.println("updating"+resultSet);
		   return "redirect:home";
		   
	   }
	   @RequestMapping(value = "/selectTags", method = RequestMethod.GET)
	   public String selectTags(ModelMap model) throws SQLException {

		   // TODO: update tags
		   DBConnection.connSQL();
		   String selectSql = "select * from tag ";
		   ResultSet resultSet = DBConnection.selectSQL(selectSql);
		   while(resultSet.next())
		   {
			  System.out.println("selecting"+resultSet.getString("tag_name"));
		   }
		   
		   return "redirect:home";
		   
	   }
	
}

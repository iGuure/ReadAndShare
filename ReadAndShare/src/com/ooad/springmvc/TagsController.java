package com.ooad.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import util.DBConnection;
import util.IDBConnection;
import util.LoginStatus;

@Controller
public class TagsController {
	
	private IDBConnection dBConnection = DBConnection.getInstance();
	
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
		   String insertSql1 = "insert into tag(tag_type,tag_name) values('文学','小说')";
		   String insertSql2 = "insert into user_tag(user_account,tag_name) values('"+loginStatus.getUserPhoneNumber()+"','"+"小说')";
		   String insertSql3 = "insert into tag(tag_type,tag_name) values('流行','漫画')";
		   String insertSql4 = "insert into user_tag(user_account,tag_name) values('"+loginStatus.getUserPhoneNumber()+"','漫画')";
		   String insertSql5 = "insert into tag(tag_type,tag_name) values('科技','互联网')";
		   String insertSql6 = "insert into user_tag(user_account,tag_name) values('"+loginStatus.getUserPhoneNumber()+"','"+"互联网')";
//		   DBConnection.connSQL();
//		   String insertSql = "insert into tag(tag_name"
//		   		+ ") values('madiao')";
//		   Boolean resultSet = DBConnection.insertSQL(insertSql);
//		   System.out.println("updating"+resultSet);
		   dBConnection.insertSQL(insertSql1);
		   dBConnection.insertSQL(insertSql2);
		   dBConnection.insertSQL(insertSql3);
		   dBConnection.insertSQL(insertSql4);
		   dBConnection.insertSQL(insertSql5);
		   dBConnection.insertSQL(insertSql6);
		   
		   return "redirect:home";
		   
	   }
	
}

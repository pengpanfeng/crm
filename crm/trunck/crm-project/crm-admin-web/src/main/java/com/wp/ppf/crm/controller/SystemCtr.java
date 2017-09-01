package com.wp.ppf.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SystemCtr {
	@RequestMapping(value="/",produces={"application/json","text/html"})
	public String indexPage() {
		return "system/index";
	}
	@RequestMapping(value="/login",method=RequestMethod.GET,produces={"application/json","text/html"})
	public String loginPage() {
		return "system/loginPage";
	}
	
	@RequestMapping(value="/login.do",method=RequestMethod.POST,produces={"application/json","text/html"})
	public String login(UserDto userDto) {
		return "system/loginPage";
	}
	
}

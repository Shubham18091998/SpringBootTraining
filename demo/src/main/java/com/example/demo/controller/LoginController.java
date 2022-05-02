package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Login;

@RestController
public class LoginController {

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView getLoginForm() {
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping(value="/validate",method=RequestMethod.POST)
	public ModelAndView validateLogin(String user, String password) {
		ModelAndView mv=new ModelAndView();
		Login loginObj=new Login(user,password);
		String view="";
		if(user.equals("admin") && user.equals("admin")) {
			mv.addObject("login",loginObj);
			view="success";
		}
		else {
			view="login";
		}
		mv.setViewName(view);
		return mv;
	}
}

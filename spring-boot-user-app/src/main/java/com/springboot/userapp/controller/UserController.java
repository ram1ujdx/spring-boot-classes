package com.springboot.userapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.userapp.model.User;

@Controller
public class UserController {

	String message="How are you?";
	
	@GetMapping("/message")
	public ModelAndView showMessage() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("message",message);
		mv.setViewName("show.jsp");
		return mv;
	}
	
	@PostMapping("/user")
	public String showUser(Model m, @RequestParam("txtUserId") int id,
									@RequestParam("txtUserName") String userName,
									@RequestParam("txtUserAge") int age) {
		
		User user=new User(id, userName, age);
		m.addAttribute("user",user);
		return "show-user.jsp";
		
	}
	
	
	
	
	
	
}

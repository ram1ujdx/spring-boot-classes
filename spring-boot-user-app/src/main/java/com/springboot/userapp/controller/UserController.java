package com.springboot.userapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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

//Reading Data Using @RequestParam
	
//	@PostMapping("/user")
//	public String showUser(Model m, @RequestParam("userId") int id,
//									@RequestParam("userName") String userName,
//									@RequestParam("age") int age) {
//		
//		User user=new User(id, userName, age);
//		m.addAttribute("user",user);
//		return "show-user.jsp";
//		
//	}
	
	
//Reading Data Using @ModelAttribute
	
	@PostMapping("/user")
	public String showUser(@ModelAttribute("user") User user) {
		
		return "show-user.jsp";
		
	}
	
	
	
	
	
	
}

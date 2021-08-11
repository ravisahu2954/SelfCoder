package com.selfcoder.springpro;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody
public class TestController {


	
	@Autowired
	private UserRepository userRepository;
	
//	@RequestMapping(value="/", method=RequestMethod.GET)==@GetMapping("/") 
	@GetMapping("/")
	public String firstHandler(Model model)
	{
	//	model.addAttribute("name", "ravi");
	//	model.addAttribute("curtime", new Date().toLocaleString());
		return "hom";
	}
	@RequestMapping("/about")
	public String first()
	{
		
		return "about";
	}
	@RequestMapping("/contact")
	public String fifth()
	{
		
		return "contact";
	}
	@RequestMapping("/practice")
	public String six()
	{
		
		return "practice";
	}
	
	
	@RequestMapping("/login")
	public String second(Model model)
	{
		User user = new User();
		System.out.println(user);
		model.addAttribute("user", user);
		return "login";
	}
  @RequestMapping(value="/do_register" , method = RequestMethod.POST)
	public String thired(@ModelAttribute("user") User user , Model model)
	{
	//	System.out.print("user  " +user );
	User re = this.userRepository.save(user);
//	this.userr
	model.addAttribute("user", re);
	
		return "login";
	}
	
	
}

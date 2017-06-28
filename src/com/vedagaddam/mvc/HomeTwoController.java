package com.vedagaddam.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeTwoController {

	//Controller to call the initial form page
	@RequestMapping("/showform")
	public String showForm(){
		return "name-form";
	}
	
	//Controller to process the HTML form
	@RequestMapping("/processNameForm")
	public String processForm(){
		return "process-name";
	}
	
	//Controller to add and set attributes using binding request parameters
	//add data to model
	@RequestMapping("/processInterForm")
	public String processInterForm(@RequestParam("name") String name, Model model){
	
		//String name = req.getParameter("name");
		name = name.toUpperCase();
		String welc = "Welcome "+name +" -I- ";
		model.addAttribute("message", welc);
		return "process-I-name";
	}
	/*
	 * //Controller to add and set attributes using http req res-
	//add data to model
	@RequestMapping("/processInterForm")
	public String processInterForm(HttpServletRequest req, Model model){
	
		String name = req.getParameter("name");
		name = name.toUpperCase();
		String welc = "Welcome "+name;
		model.addAttribute("message", welc);
		return "process-I-name";
	}*/
	
}





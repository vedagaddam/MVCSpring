package com.vedagaddam.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
}

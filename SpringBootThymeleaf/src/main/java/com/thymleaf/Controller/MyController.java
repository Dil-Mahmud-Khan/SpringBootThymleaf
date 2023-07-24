package com.thymleaf.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MyController {

	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("name","dil");
		System.out.println("Works");
		return "about";
	}
	
	@GetMapping("/example-loop")
	public String iterate(Model m) {
		
		
		List<String> names = List.of("Dil","Mahmud","Khan");
		m.addAttribute("names",names);
		
		return "iterate";
	}
	
	
	@GetMapping("/condition")
	public String condition(Model model) {
		model.addAttribute("isActive",false);
		model.addAttribute("gender","F");
		return "condition";
		 
	}
}

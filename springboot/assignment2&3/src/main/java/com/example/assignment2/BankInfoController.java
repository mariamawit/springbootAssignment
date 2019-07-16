package com.example.assignment2;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankInfoController {
	
	@RequestMapping ("/location")
	public String location(Map<String, Object> model) {
		model.put("key1", "Wipro");
		return "LocationDisplay";
	}

	@RequestMapping ("/services")
	public String services(Map<String, Object> model) {
		model.put("key1", "Wipro");
		return "ServicesDisplay";
	}
	
	
}

package com.example.demo.Resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping({"/hello"})
	public String hello() {
		return "Hello World";
	}

}

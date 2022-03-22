package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@RequestMapping("/hiii")
	@ResponseBody
	public String greet() {
		System.out.println("Welcome to the Application");
		return "Welcome";
	}

	@RequestMapping("/")
	public String xyz() {
		return "login.html";
	}

	@RequestMapping("/verify")
	public String verify(@RequestParam("user") String iii, String password) {
		return "Welcome.jsp";
	}

}

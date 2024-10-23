package com.web.lovetrail;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {

	@GetMapping(value = "/main.do")
	public String index(Model model, HttpSession session) {
	
		return "main";
	}
	
}

package com.avenger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

	@RequestMapping("/hello")
	public String index(Model model) {
		model.addAttribute("name", "ddllddd");
		model.addAttribute("str", "hellofsd world!!!dd");
		return "hello";
	}
}

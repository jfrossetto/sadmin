package br.com.jfr.sa.sadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "spring boot ... teste";
	}
}

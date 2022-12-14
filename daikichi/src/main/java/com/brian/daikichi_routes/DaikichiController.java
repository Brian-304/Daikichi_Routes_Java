package com.brian.daikichi_routes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	@RequestMapping("/")
	public String index() {
		return "Hello World!";
	}
	
	@RequestMapping("/daikichi")
		public String welcome() {
		return "Welcome!";
	}
	
	@RequestMapping("/daikichi/today")
		public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/daikichi/tomorrow")
		public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
		
	}
	
}
	

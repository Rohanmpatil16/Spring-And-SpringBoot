package com.hlo.hlo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hlo {
	@Autowired
	private car c;
	
	@RequestMapping("/")
	

	public String greet(){
		
		c.run();
		return "hlo my name is rohan patil";
	}
	

	

}

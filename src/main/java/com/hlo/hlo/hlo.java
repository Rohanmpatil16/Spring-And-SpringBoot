package com.hlo.hlo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hlo {
	@RequestMapping("/")
	public String greet(){
		return "hlo";
	}
	

	

}

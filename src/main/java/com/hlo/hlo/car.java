package com.hlo.hlo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class car {
	@Autowired
	private Engine engine;
	public void run()
	{
		engine.com();
		System.out.println("Run the car");
	}
}

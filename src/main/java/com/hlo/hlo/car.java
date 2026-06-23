package com.hlo.hlo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class car {
	@Autowired
	private List<Engine> e;
	public void run()
	{
		for(Engine en:e)
		{
			en.com();
		}
		System.out.println("Run the car");
	}
}

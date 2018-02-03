package com.testapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ServicesApp {
	
	
	@RequestMapping("/")
   public String home() {
        return "Hello World!";
    }
	
	@RequestMapping("/getMsg")
	public String getMsg()
	{
		return "HI Hello";
	}

	@RequestMapping("/getnew")
	public String getNewMsg()
	{
		return "HI Hello New";
	}

	
}

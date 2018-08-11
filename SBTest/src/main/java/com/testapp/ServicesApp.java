package com.testapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ServicesApp {
	
	@Value("${arun.urls}")
	private String welcomeMessage;
	
	@RequestMapping("/")
   public String home() {
        return welcomeMessage;
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

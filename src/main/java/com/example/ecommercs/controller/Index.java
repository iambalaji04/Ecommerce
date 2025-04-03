package com.example.ecommercs.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Index {
	@GetMapping("home")
	public String get1()
	{
		return "index";
	}
	@GetMapping("blog")
	public String get2()
	{
		return "blog";
	}
	@GetMapping("class")
	public String get3()
	{
		return "class";
	}
	@GetMapping ("about")
	public String get4()
	{
		return "about";
	}

}

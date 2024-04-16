package com.example.springboot.webservicesfile1.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.webservicesfile1.service.EntityServiceImpl;
@RestController
public class Controller {

@GetMapping("/fileread")
	public void test()
	{
		EntityServiceImpl e = new EntityServiceImpl();
		e.read();
	}
}

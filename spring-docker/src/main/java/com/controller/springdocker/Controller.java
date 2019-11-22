package com.controller.springdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class Controller {

	@GetMapping
	public String hello()
	{
		return "heloo Vinod";
	}
}

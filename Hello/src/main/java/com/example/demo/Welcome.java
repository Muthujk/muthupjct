package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@RestController
public class Welcome {
	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
public  String welcome()
{
		return "hi";
}
}

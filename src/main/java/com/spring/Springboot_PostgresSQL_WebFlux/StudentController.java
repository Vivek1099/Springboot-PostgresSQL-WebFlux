package com.spring.Springboot_PostgresSQL_WebFlux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class StudentController 
{
	@Autowired
	StudentRepository srepo;
	
	@RequestMapping("/test")
	public String test()
	{
		return "postgres webflux test";
	}
	
	@RequestMapping("/save")
	public Mono<Student> savedata(@RequestBody Student student)
	{
		return srepo.save(student);
	}
	
	@RequestMapping("/show")
	public Flux<Student> showdata()
	{
		return srepo.findAll();
	}
}

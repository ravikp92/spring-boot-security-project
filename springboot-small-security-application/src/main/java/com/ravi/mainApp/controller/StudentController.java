package com.ravi.mainApp.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.mainApp.pojo.Student;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/app/v1")
public class StudentController {
	
	private static final String template= "Hello , %s!";
	private final AtomicLong counter= new AtomicLong();
	
	@RequestMapping("/student")
	public Student details(@RequestParam(value="name", defaultValue = "world")String name) {
		return new Student(counter.incrementAndGet(),String.format(template, name));
	}
		
}

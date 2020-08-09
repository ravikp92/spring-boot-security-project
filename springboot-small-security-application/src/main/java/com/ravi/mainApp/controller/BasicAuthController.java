package com.ravi.mainApp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.mainApp.pojo.AuthenticationBean;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/app/v1")
public class BasicAuthController {

		@RequestMapping("/basicauth")
		public AuthenticationBean basicAuth() {
			return new AuthenticationBean("Welcome !!You are authenticated!!");
		}
			
}


package com.wellsfargo.app.controller;

import com.wellsfargo.app.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping(path = "/v1/login", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Object doLogin() {
		return new ResponseEntity<>(HttpStatus.OK);


	}

}

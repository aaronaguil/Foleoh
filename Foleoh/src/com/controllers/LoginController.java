package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.data.LoginDAO;

@RestController
public class LoginController {
	
	
	@Autowired
	private LoginDAO loginDao;

}

package com.example.bookmyshow.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
 @GetMapping("/add")
 public ResponseEntity<String> getUser(@RequstBody)
 {
	 return new ResponseEntity<>("",HttpStatus.ACCEPTED)
 }

}

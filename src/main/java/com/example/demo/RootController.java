package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

	
	@PostMapping("/root")
	public ResponseEntity  postData(@RequestBody String fullName) {
		System.out.println("postData called");
		System.out.println(fullName);
		System.out.println("postData Done");
		return new ResponseEntity("Post sucess",HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity getData() {
		
		System.out.println("getData called");
		return new ResponseEntity("sucess",HttpStatus.OK);
	}
}

package com.example.demo;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@PostMapping("/register")
	public ResponseEntity<UserRegistrationResponse> registerUser(@RequestBody UserRegistrationRequest userRequest){
		
		if(userRequest.getName()==null || userRequest.getEmail()==null || userRequest.getPassword()==null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
		
		String authToken = generateAuthToken();
		Long userId = generateUserId();
		
		UserRegistrationResponse response = new UserRegistrationResponse(authToken,userId);
		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/login")
	public ResponseEntity<UserLoginResponse> loginUser(@RequestBody UserLoginRequest userRequest){
		
		if(userRequest.getEmail()==null || userRequest.getPassword()==null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
		
		String authToken = generateAuthToken();
		Long userId = generateUserId();
		
		UserLoginResponse response = new UserLoginResponse(authToken,userId);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/user/")
	public List<AdvisorDetails> getListOfAdvisors() {
		return null;
		
	}
	
	@PostMapping("/user/")
	public ResponseEntity<T> bookCallWithAdvisor() {
		
	}
	
	public List<AdvisorDetails> getAllBookedCalls() {
		return null;
		
	}
}

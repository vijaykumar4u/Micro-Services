package com.vijay.api.gatway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {
	@GetMapping("/userServiceFallback")
	public String userServiceFallback() {
		return "User Service is taking longer than expected." + "   " + "Please try again later";
	}

	@GetMapping("/departmentServiceFallback")
	public String departmentServiceFallback() {
		return "Department Service is taking longer than expected." + "   " + "Please try again later";
	}

}

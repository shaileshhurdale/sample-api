package com.woodlands;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/greeting")
	public String sendMessage() {
		return "Hello World from Sample API!";
	}
}

package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.messages.HelloWorldResponse;

@RestController
public class DemoController {

	@GetMapping(path="/Hello",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String helloWord() {
		return "{\"message\":\"Hello Word\"}";
	}
	
	@GetMapping(path="/Hello2",produces=MediaType.APPLICATION_XML_VALUE,headers="Accept=*/*")
	public @ResponseBody ResponseEntity<HelloWorldResponse> helloWord2() {
		return ResponseEntity.ok().body(new HelloWorldResponse());
	}
	
}

package com.cg.BasicSpringbootApp.controllers;

import java.util.HashMap;
import java.util.Map;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.newrelic.api.agent.Trace;

@RestController
public class BasicController {
	
	//private static int count = 0;
	
	//private String message = "Hello World ";
	
	@GetMapping("/getMessage")
	@Trace (dispatcher=true)
	public ResponseEntity<Map<String, Object>> getMessage() {
		//count++;
		
		Map<String, Object> response = new HashMap<>();
		
		response.put("Id", "123456789");
		response.put("Name", "James Hook");
		response.put("City", "New York");
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	/*
	 * @PostMapping("/addMessage") public ResponseEntity<String>
	 * addMessage(@RequestBody String requestMessage) {
	 * System.out.println("Message Need to add : " + requestMessage); message =
	 * requestMessage; return new ResponseEntity<>("Messages '" + requestMessage +
	 * "' added", HttpStatus.OK); }
	 * 
	 * 
	 * HttpConnector httpConnector = new HttpConnector();
	 * 
	 * @RequestMapping("/getMessageVia") public String getHttp() { //return
	 * template.requestBody("direct:startGet", null, String.class); String response
	 * = httpConnector.getHttp(); System.out.println("Response from the getHttp : "
	 * + response);
	 * 
	 * return response; }
	 * 
	 * @RequestMapping("/addMessageVia") public String postHttp() { //return
	 * template.requestBody("direct:startGet", null, String.class); String response
	 * = httpConnector.postHttp();
	 * System.out.println("Response from the postHttp : " + response);
	 * 
	 * return response; }
	 */

}

package io.startup.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.startup.service.KafkaProducerService;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

	@Autowired
	private KafkaProducerService kafkaProducerService;
	
	
	@PutMapping("/sendLocation")
	public ResponseEntity updatedLocation() throws InterruptedException {
		
		Map<String, String> response = new HashMap<String, String>();
		response.put("message", "location status");
		
		int locationRange = 10;
		while(locationRange > 0) {
			//System.out.println(Math.random() +","+ Math.random());
			kafkaProducerService.updatedLocation(Math.random() +","+ Math.random());
			Thread.sleep(2000);
			locationRange--;
		}
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
}

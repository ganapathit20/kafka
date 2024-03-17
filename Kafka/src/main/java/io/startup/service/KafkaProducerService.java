package io.startup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public boolean updatedLocation(String location) {
		kafkaTemplate.send("kafka-new-event", location);
		return true;
	}
	
	@KafkaListener(topics = "kafka-new-event", groupId = "user")
	public void locationConsoumer(String location) {
		System.out.println(location);
	}

}

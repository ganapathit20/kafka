package io.startup;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import redis.clients.jedis.Jedis;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}
	
/*	
	@Bean
	public void init() {
		 // Connect to the Redis server. Make sure Redis server is running on localhost:6379 (default port).
        Jedis jedis = new Jedis("localhost", 6379);

        // Basic Redis operations
        jedis.set("mykey", "Hello, Redis!");
        String value = jedis.get("mykey");
        System.out.println("Value of 'mykey': " + value);

        // Increment a counter
        jedis.incr("counter");
        System.out.println("Counter value: " + jedis.get("counter"));

        Map<String, String> names = new HashMap<String, String>();
        names.put("Ganapathi", "new developer");
        jedis.hset("myName", names);
        // Closing the connection to Redis
        jedis.close();
	}
*/

}

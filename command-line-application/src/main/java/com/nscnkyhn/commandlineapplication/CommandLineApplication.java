package com.nscnkyhn.commandlineapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class CommandLineApplication {
	private static final Logger LOG = LoggerFactory.getLogger(CommandLineApplication.class);

	@Bean
	public RestTemplate restTemplae (RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run (RestTemplate restTemplate) throws Exception {
		return args -> {
			LOG.info("Command Line Application Started");
			ResponseEntity<List<RoomModel>> rooms = restTemplate.exchange("http://localhost:8080/api/rooms", HttpMethod.GET, null, new ParameterizedTypeReference<List<RoomModel>>() {});
			rooms.getBody().forEach(room -> {
				LOG.info(room.toString());
			});
			LOG.info("Command Line Application Finished");
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(CommandLineApplication.class, args);
	}

}

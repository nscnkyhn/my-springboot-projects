package com.nscnkyhn.fizzbuzzgame;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FizzBuzzGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzGameApplication.class, args);
	}

	@Bean
	CommandLineRunner run () {
		String result;
		for (int i = 1; i < 101; i++) {
			result = "";
			if (i % 15 == 0) {
				result = "fizzbuzz";
			} else if (i % 5 == 0) {
				result = "buzz";
			} else if (i % 3 == 0) {
				result = "fizz";
			} else {
				result = String.valueOf(i);
			}
			System.out.println(result);
		}
		return null;
	}

}

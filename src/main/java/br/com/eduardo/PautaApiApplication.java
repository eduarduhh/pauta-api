package br.com.eduardo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class PautaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PautaApiApplication.class, args);
	}


}

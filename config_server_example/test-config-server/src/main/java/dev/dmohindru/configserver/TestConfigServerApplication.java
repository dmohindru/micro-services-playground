package dev.dmohindru.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TestConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestConfigServerApplication.class, args);
	}

}

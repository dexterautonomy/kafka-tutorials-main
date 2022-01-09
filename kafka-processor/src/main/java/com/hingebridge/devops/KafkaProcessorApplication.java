package com.hingebridge.devops;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Kafka Processor One", version = "1.0", description = "Open API documentation"))
public class KafkaProcessorApplication {
	public static void main(String[] args) {
		SpringApplication.run(KafkaProcessorApplication.class, args);
	}
}

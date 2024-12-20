package com.spring.kafka.observation.issue.kafkaSample;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSampleApplication.class, args);
	}

	@Bean
	public Supplier<UUID> sampleKafkaProducer() {
		return () -> {
			var uuid = UUID.randomUUID();
			return uuid;
		};
	}

	@Bean
	public Consumer<UUID> sampleKafkaConsumer() {
		return uuid -> {
		};
	}

}

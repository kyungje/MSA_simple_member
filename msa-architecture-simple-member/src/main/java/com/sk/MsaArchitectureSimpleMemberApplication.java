package com.sk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication
public class MsaArchitectureSimpleMemberApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsaArchitectureSimpleMemberApplication.class, args);
	}

}

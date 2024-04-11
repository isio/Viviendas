package com.ic.ms.app.fraccionamientos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsFraccionamientosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsFraccionamientosApplication.class, args);
	}

}

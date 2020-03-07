package org.tsp.projects.ledar.referencedata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ReferenceDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReferenceDataApplication.class, args);
	}

}

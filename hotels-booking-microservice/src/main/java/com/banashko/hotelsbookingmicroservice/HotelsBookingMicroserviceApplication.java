package com.banashko.hotelsbookingmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HotelsBookingMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelsBookingMicroserviceApplication.class, args);
	}

}

package com.banashko.hotelsbookingmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.banashko.hotelsbookingmicroservice.proxy"})
public class HotelsBookingMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelsBookingMicroserviceApplication.class, args);
	}

}

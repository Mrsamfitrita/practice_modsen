package com.example.hotel_booking;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HotelBookingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HotelBookingApplication.class, args);
	}

}

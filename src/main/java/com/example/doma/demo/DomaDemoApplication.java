package com.example.doma.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.doma.demo.dao.ReservationDao;
import com.example.doma.demo.entity.Reservation;

@SpringBootApplication
public class DomaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomaDemoApplication.class, args);
	}

	@Autowired
	ReservationDao reservationDao;

	@Bean
	CommandLineRunner runner() {
		return args -> Arrays.asList("spring", "spring boot", "spring cloud", "doma").forEach(s -> {
			Reservation r = new Reservation();
			r.name = s;
			reservationDao.insert(r);
		});
	}
}

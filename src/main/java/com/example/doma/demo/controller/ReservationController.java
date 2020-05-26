package com.example.doma.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.doma.demo.dao.ReservationDao;
import com.example.doma.demo.entity.Reservation;

@RestController
public class ReservationController {
	@Autowired
	ReservationDao reservationDao;

	@RequestMapping(path = "/")
	public List<Reservation> all() {
		return reservationDao.selectAll();
	}

	@RequestMapping(path = "/", params = "q")
	public List<Reservation> findByName(@RequestParam("q") String name) {
		return reservationDao.selectByName(name);
	}
}

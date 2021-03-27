package com.theatre.movieticket.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theatre.movieticket.model.ShowDetailsModel;

@RestController
public class BookingController {

	@GetMapping("/allShowsForBooking")
	public List<ShowDetailsModel> getAllShows(ShowDetailsModel showDetailsModel){
		//Get all shows logic here
		//for temporary create blank Arraylist
		List<ShowDetailsModel> allShowsList = new ArrayList<ShowDetailsModel>();
		return allShowsList;
	}
	
	@PostMapping("/booking")
	public String booking(BookingDetails bookingDetails){
		//logic for generate booking Id and set in bookingDetails		
		return "Success with bookingId or Failure with error message";
	}
}

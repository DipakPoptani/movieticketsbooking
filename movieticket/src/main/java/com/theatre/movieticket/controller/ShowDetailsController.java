package com.theatre.movieticket.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theatre.movieticket.model.ShowDetailsModel;

@RestController
public class ShowDetailsController {
	
	@GetMapping("/getAllShows")
	public List<ShowDetailsModel> getAllShows(ShowDetailsModel showDetailsModel){
		//Get all shows logic here
		//for temporary create blank Arraylist
		List<ShowDetailsModel> allShowsList = new ArrayList<ShowDetailsModel>();
		return allShowsList;
	}
	
	@PostMapping("/addShowDetails")
	public String addShowDetails(ShowDetailsModel showDetailsModel){
		//Adding logic here
		return "success";
	}

}

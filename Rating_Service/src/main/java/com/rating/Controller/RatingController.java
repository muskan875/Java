package com.rating.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.Dto.RatingDto;
import com.rating.Entities.Rating;
import com.rating.Services.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	private RatingService ratingService;

	@PostMapping
	public Rating addRating(@RequestBody RatingDto ratingdto) {
		return ratingService.saveRating(ratingdto);
	}
	
	@GetMapping
	public List<Rating> getRating(){
		return ratingService.getAllRatings();
	}
}

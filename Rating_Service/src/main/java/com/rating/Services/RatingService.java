package com.rating.Services;

import java.util.List;

import com.rating.Dto.RatingDto;
import com.rating.Entities.Rating;

public interface RatingService {

	public Rating saveRating(RatingDto ratingdto);
	
	public List<Rating> getAllRatings();
}

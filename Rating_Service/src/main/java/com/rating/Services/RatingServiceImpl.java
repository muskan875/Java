package com.rating.Services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.Dto.RatingDto;
import com.rating.Entities.Rating;
import com.rating.Repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	private RatingRepository ratingRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	

	@Override
	public Rating saveRating(RatingDto ratingdto) {
		Rating rating = modelMapper.map(ratingdto, Rating.class);
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRatings() {
		List<Rating> ratings = ratingRepository.findAll();
		return ratings;
	}
	

}
